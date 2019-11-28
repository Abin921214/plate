package com.jzhl.plate.utils;

import com.jzhl.plate.mapper.PlateOwnerCarNumberDAO;
import com.jzhl.plate.model.*;
import com.jzhl.plate.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 车牌通过出口出去通用方法
 * @author xbin
 */
@Service
public class PlateUtils {

    @Resource
    PlateDeviceService plateDeviceService;

    @Resource
    PlateConfigService plateConfigService;

    @Resource
    PlateOwnerCarNumberService plateOwnerCarNumberService;

    @Resource
    PlateVisitorCarNumberService plateVisitorCarNumberService;

    @Resource
    PlateOwnerCarNumberDAO plateOwnerCarNumberDAO;

    @Resource
    PlateRecordService plateRecordService;

    @Autowired
    RedisUtil redisUtil;

    /**
     * 臻识设备识别车牌反馈数据
     * @param license           车牌号
     * @param serialno          设备序列号
     * @param imageFile         大图
     * @param imageFragmentFile 小图
     * @param response          请求
     * @throws IOException
     */
    public void addRecord(HttpServletRequest request, String license, String serialno, String imageFile, String imageFragmentFile, HttpServletResponse response) throws IOException {

//        System.out.println("-----------------进入车牌识别操作 ---------------------" + "车牌：" +  license + "  设备序列号:" + serialno);

        // 根据序列号查询设备   -- 没有设备直接开闸   --- 写入错误日志
        PlateDevice plateDevice = plateDeviceService.selectByExample(serialno);
        if(StringUtils.isEmpty(plateDevice)){
//            System.out.println("-----------------根据序列号未查询到车牌识别设备信息---------------------");
            ZenithUtils.open(response);
            return;
        }

        //获取设备的配置信息
        PlateConfig plateConfig = plateConfigService.selectByExample(plateDevice.getDevDistrictId());
        if(plateConfig == null){
//            System.out.println("-----------------未找到小区的车牌系统配置信息---------------------");
            ZenithUtils.open(response);
            return;
        }

        //判断该设备序列号是那个出口的
        if(plateDevice.getInOut() == 1){
            // 入口设备操作
//            System.out.println("------------------device start in---------------------");
            isIn(request, license,plateDevice,plateConfig, response, imageFile, imageFragmentFile);
        }else{
            // 出口设备操作
//            System.out.println("------------------device start out---------------------");
            // 出口设备判断是否需要收费.// 如果不用直接通行
            if(plateRecordService.updateByExampleSelective(request, license,serialno,plateDevice.getHeId(),plateDevice.getCompanyId(),plateDevice.getDevDistrictId(), imageFile, imageFragmentFile)){
                ZenithUtils.openExitDoor(license, response);

                //更新物联小区停车数量
                plateConfigService.updateByExampleSelective(plateDevice.getDevDistrictId(), plateConfig.getCarNumber(), "add");
            }else{
                PlateRecord plateRecord = plateRecordService.selectByExample(license,serialno,plateDevice.getHeId(),plateDevice.getCompanyId());

                if(plateRecord != null){

                    long nd = 1000 * 24 * 60 * 60;//每天毫秒数
                    long nh = 1000 * 60 * 60;//每小时毫秒数
                    long nm = 1000 * 60;//每分钟毫秒数
                    long diff = plateRecord.getoTime().getTime() - plateRecord.getiTime().getTime(); // 获得两个时间的毫秒时间差异
                    long min = diff/60/1000;  // 计算差多少分钟
//                    System.out.println("相差分钟" + min);

                    //播报支付金额
                    ZenithUtils.openChargeDoor(license, plateRecord.getMoney(), min, response);
                }
            }
        }

    }



    /**
     * 入口操作
     * @param license  车牌号
     * @param plateDevice    设备信息
     * @param response 请求
     * @throws IOException
     */
    public void isIn(HttpServletRequest request, String license, PlateDevice plateDevice,PlateConfig plateConfig , HttpServletResponse response, String imageFile, String imageFragmentFile) throws IOException {

        //判断物联小区的配置信息---是否开启 【没车位时是否控制外来车辆(0没车位也允许1没车位时不允许】
        if(plateConfig.getForeignControl().equals("1") && plateConfig.getCarNumber() <=0 ){
            //车位已满，禁止入内 【如果开启车位检测】
            ZenithUtils.openForbidCarNum(license,response);
        }

//        System.out.println("-----------------进入车牌识别操作（入口操作）---------------------");
        //默认初始物联小区 车牌识别系统的运行模式。 0 普通模式  1 封闭模式
        String devDistrictModel = "0";
        if(plateConfig != null){
            devDistrictModel = plateConfig.getDevDistrictModel();
        }


        //查看业主表是否是业主车牌
        PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
        PlateOwnerCarNumberExample.Criteria criteria1 = plateOwnerCarNumberExample.createCriteria();
        criteria1.andCarNumberEqualTo(license);
        criteria1.andHeIdEqualTo(plateDevice.getHeId());
        criteria1.andCompanyIdEqualTo(plateDevice.getCompanyId());
        criteria1.andStatusEqualTo("0");
        criteria1.andIsDelEqualTo("0");
        List<PlateOwnerCarNumber> plateOwnerCarNumberList = plateOwnerCarNumberDAO.selectByExample(plateOwnerCarNumberExample);

        //判断是否封闭模式
        if(!devDistrictModel.equals("0")){
//            System.out.println("------进入封闭模式------");
            //小区处于封闭模式  查看是否是属于本小区车辆, 车辆的过期时间是否过期 【判断是否可以通行】
            if(sealOff(license, plateDevice,response)){

                ZenithUtils.openEntranceDoor(license,plateConfig.getCarNumber()-1,response);

                // 变更小区车位信息
                plateConfigService.updateByExampleSelective(plateDevice.getDevDistrictId(), plateConfig.getCarNumber(), "del");

                //插入对应的通行记录
                plateRecordService.insertSelective(request, license, plateDevice.getSerialno(), plateDevice.getHeId(), plateDevice.getCompanyId(),imageFile, imageFragmentFile);
                return;
            }else{

                //禁止通行
                ZenithUtils.openForbidModel(license,response);
                return;
            }
        }else{

            //非封闭模式
            if(plateOwnerCarNumberList.size() > 0){

                System.out.println("业主车辆");

                //允许通行
                ZenithUtils.openEntranceDoor(license,plateConfig.getCarNumber()-1,response);
            }else{

                System.out.println("外来车辆, 临时停车");

                ZenithUtils.openEntranceFeeDoor(license,plateConfig.getCarNumber()-1,response);
            }

            //插入对应的通行记录
            // 变更小区车位信息
            plateConfigService.updateByExampleSelective(plateDevice.getDevDistrictId(), plateConfig.getCarNumber(), "del");

            //插入对应的通行记录
            plateRecordService.insertSelective(request, license, plateDevice.getDeviceSerial(), plateDevice.getHeId(), plateDevice.getCompanyId(),imageFile, imageFragmentFile);
        }
    }


    /**
     * 小区处于封闭模式  查看是否是属于本小区车辆, 车辆的过期时间是否过期
     */
    public boolean sealOff(String license, PlateDevice plateDevice, HttpServletResponse response) throws IOException{
//        System.out.println("-------------------处于封闭模式------------------------------");

        PlateOwnerCarNumber plateOwnerCarNumber = plateOwnerCarNumberService.selectByExample(license, plateDevice.getHeId());
        if(plateOwnerCarNumber != null){
            if(DateUtils.compare_date(new Date(), plateOwnerCarNumber.getStartTime()) != -1 && DateUtils.compare_date(plateOwnerCarNumber.getEndTime(), new Date()) != -1){
                return true;
            }else{
                return false;
            }
        }else{
            PlateVisitorCarNumber plateVisitorCarNumber = plateVisitorCarNumberService.selectByExample(license, plateDevice.getHeId());
            if(plateVisitorCarNumber != null){
                if(DateUtils.compare_date(new Date(), plateOwnerCarNumber.getStartTime()) != -1 && DateUtils.compare_date(plateOwnerCarNumber.getEndTime(), new Date()) != -1){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

}