package com.jzhl.plate.service;

import com.jzhl.plate.bean.BaseResult;
import com.jzhl.plate.mapper.PlateFeesConfigDAO;
import com.jzhl.plate.mapper.PlateOwnerCarNumberDAO;
import com.jzhl.plate.mapper.PlateRecordDAO;
import com.jzhl.plate.mapper.PlateVisitorCarNumberDAO;
import com.jzhl.plate.model.*;
import com.jzhl.plate.utils.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PlateRecordService {

    @Resource
    PlateRecordDAO plateRecordDAO;

    @Resource
    PlateOwnerCarNumberDAO plateOwnerCarNumberDAO;

    @Resource
    PlateVisitorCarNumberDAO plateVisitorCarNumberDAO;

    @Resource
    RedisUtil redisUtil;

    @Resource
    PlateFeesConfigDAO plateFeesConfigDAO;

    @Value("${file.url}")
    private String fileUrl;



    /**
     * 根据 ID 修改对应的订单状态  支付成功之后调用的接口
     * @param id
     */
    public BaseResult updatePlateRecord(Integer id){
        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        PlateRecord plateRecord = new PlateRecord();
        plateRecord.setInOut("5");

        PlateRecord plateRecord1 = selectByExampleAndId(id);

        if(plateRecord1 != null){
            int pid = plateRecordDAO.updateByExample(plateRecord, plateRecordExample);
            if(pid > 0){
                redisUtil.remove("plate_pay_" + plateRecord1.getoSerialno());
                redisUtil.set("plate_open_" + plateRecord1.getoSerialno(),new Date());
                return  new BaseResult("1","ok",null);
            }else{
                return  new BaseResult("0","订单修改失败",null);
            }
        }
        return  new BaseResult("0","订单修改失败",null);
    }



    /**
     * 根据ID 获取对应的支付订单信息
     * @param id
     * @return
     */
    public PlateRecord selectByExampleAndId(Integer id){
        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        List<PlateRecord> plateRecordList = plateRecordDAO.selectByExample(plateRecordExample);
        if(plateRecordList.size() > 0){
            return plateRecordList.get(0);
        }else{
            return null;
        }
    }


    /**
     * 根据小区 公司 车牌查询对应缴费订单信息
     * @param license
     * @param iSerialno
     * @param heId
     * @param companyId
     * @return
     */
    public PlateRecord selectByExample(String license, String iSerialno, Integer heId, Integer companyId){
        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andHeIdEqualTo(heId);
        criteria.andCompanyIdEqualTo(companyId);
        criteria.andLicenseEqualTo(license);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");
        criteria.andInOutEqualTo("4");
        List<PlateRecord> plateRecordList = plateRecordDAO.selectByExample(plateRecordExample);
        if(plateRecordList.size() > 0){
            return plateRecordList.get(0);
        }else{
            return null;
        }
    }


    /**
     * 添加车牌入场记录信息  入口处   先判断是否存在错误的历史记录，如果存在， 全部变更为 异常数据
     * @param license
     * @param iSerialno
     * @param heId
     * @param companyId
     * @return
     */
    public void insertSelective(HttpServletRequest request, String license, String iSerialno, Integer heId, Integer companyId , String imageFile, String imageFragmentFile){

        List<String> inOutList = new ArrayList<>();
        inOutList.add("1");
        inOutList.add("4");

        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andHeIdEqualTo(heId);
        criteria.andCompanyIdEqualTo(companyId);
        criteria.andLicenseEqualTo(license);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");
        criteria.andInOutIn(inOutList);

        List<PlateRecord> plateRecordList = plateRecordDAO.selectByExample(plateRecordExample);
        if(plateRecordList.size() > 0){
            PlateRecord plateRecord2 = new PlateRecord();
            plateRecord2.setInOut("3");
            plateRecord2.setBuildTime(new Date());

            plateRecordDAO.updateByExampleSelective(plateRecord2, plateRecordExample);
        }


        PlateRecord plateRecord = new PlateRecord();
        plateRecord.setLicense(license);
        plateRecord.setiSerialno(iSerialno);
        plateRecord.setiTime(new Date());
        plateRecord.setBuildTime(new Date());
        plateRecord.setHeId(heId);
        plateRecord.setCompanyId(companyId);
        plateRecord.setInOut("1");

        String image = ImageUtil.getPlateImageUrl(request, heId, imageFile,fileUrl);
        if(image != null){
            plateRecord.setiImage(image);
        }

        String imageFragment = ImageUtil.getPlateImageUrl(request, heId, imageFragmentFile, fileUrl);
        if(imageFragment != null){
            plateRecord.setiImageFragment(imageFragment);
        }

        plateRecordDAO.insertSelective(plateRecord);
    }


    /**
     *  出口设备，判断是否存在入口记录 如果没有就直接添加异常数据
     */
    public Boolean updateByExampleSelective(HttpServletRequest request, String license,String oSerialno,Integer heId, Integer companyId, Integer devDistrictId, String imageFile, String imageFragmentFile){

        Date startTime = null;

        List<String> inOutList = new ArrayList<>();
        inOutList.add("1");
        inOutList.add("4");


        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andHeIdEqualTo(heId);
        criteria.andCompanyIdEqualTo(companyId);
        criteria.andLicenseEqualTo(license);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");
        criteria.andInOutIn(inOutList);
        List<PlateRecord> plateRecordList = plateRecordDAO.selectByExample(plateRecordExample);

        if(plateRecordList.size() <= 0){
            //出口时， 不存在对应进口和待支付通行记录  添加异常的出口记录
            PlateRecord plateRecord = new PlateRecord();
            plateRecord.setLicense(license);
            plateRecord.setoSerialno(oSerialno);
            plateRecord.setoTime(new Date());
            plateRecord.setBuildTime(new Date());
            plateRecord.setHeId(heId);
            plateRecord.setCompanyId(companyId);
            plateRecord.setInOut("3");

            String image = ImageUtil.getPlateImageUrl(request, heId, imageFile, fileUrl);
            if(image != null){
                plateRecord.setoImage(image);
            }

            String imageFragment = ImageUtil.getPlateImageUrl(request, heId, imageFragmentFile, fileUrl);
            if(imageFragment != null){
                plateRecord.setoImageFragment(imageFragment);
            }

            plateRecordDAO.insertSelective(plateRecord);

            return true;

        }else{

            //存在对应进口和待支付通行记录.
            // 查看是否是 小区车辆或者访客车牌 ，并且车辆是否过期
            // 计算收费金额并生成订单
            PlateRecord plateRecordone = plateRecordList.get(0);

            //查看业主表是否是业主车牌
            PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
            PlateOwnerCarNumberExample.Criteria criteria1 = plateOwnerCarNumberExample.createCriteria();
            criteria1.andCarNumberEqualTo(license);
            criteria1.andHeIdEqualTo(heId);
            criteria1.andCompanyIdEqualTo(companyId);
            criteria1.andStatusEqualTo("0");
            criteria1.andIsDelEqualTo("0");
            List<PlateOwnerCarNumber> plateOwnerCarNumberList = plateOwnerCarNumberDAO.selectByExample(plateOwnerCarNumberExample);
            if(plateOwnerCarNumberList.size() <= 0){
                //不存在业主车牌，查询对应的访客车牌
                PlateVisitorCarNumberExample plateVisitorCarNumberExample = new PlateVisitorCarNumberExample();
                PlateVisitorCarNumberExample.Criteria criteria2 = plateVisitorCarNumberExample.createCriteria();
                criteria2.andCarNumberEqualTo(license);
                criteria2.andHeIdEqualTo(heId);
                criteria2.andCompanyIdEqualTo(companyId);
                criteria2.andStatusEqualTo("0");
                criteria2.andIsDelEqualTo("0");
                List<PlateVisitorCarNumber> plateVisitorCarNumberList = plateVisitorCarNumberDAO.selectByExample(plateVisitorCarNumberExample);

                if(plateVisitorCarNumberList.size() <= 0){
                    //不存在访客车牌
                    startTime = plateRecordone.getiTime();
                }else{
                    //判断是否在开始和过期时间范围内
                    if(DateUtils.compare_date(new Date(), plateVisitorCarNumberList.get(0).getStartTime()) != -1 && DateUtils.compare_date(plateVisitorCarNumberList.get(0).getEndTime(), new Date()) != 1){
                        outOK(request, plateRecordone.getId(), oSerialno, heId, imageFile, imageFragmentFile);
                        return true;
                    }else{
                        //判断是用 进口记录时间 还是用过期时间作为计算收费开始时间标准
                        if(DateUtils.compare_date(plateVisitorCarNumberList.get(0).getEndTime(), new Date()) == -1 && DateUtils.compare_date(plateVisitorCarNumberList.get(0).getEndTime(),plateRecordone.getiTime()) == 1){
                            startTime = plateVisitorCarNumberList.get(0).getEndTime();
                        }else{
                            startTime = plateRecordone.getiTime();
                        }
                    }
                }
            }else{
                //存在业主车牌
                if(DateUtils.compare_date(new Date(), plateOwnerCarNumberList.get(0).getStartTime()) != -1 && DateUtils.compare_date( new Date(), plateOwnerCarNumberList.get(0).getEndTime()) != 1){
                    outOK(request, plateRecordone.getId(), oSerialno, heId, imageFile, imageFragmentFile);
                    return true;
                }else{
                    //判断是用进口记录时间还是用 过期时间作为计算收费开始时间标准
                    if(DateUtils.compare_date(plateOwnerCarNumberList.get(0).getEndTime(), new Date()) == -1 && DateUtils.compare_date(plateOwnerCarNumberList.get(0).getEndTime(),plateRecordone.getiTime()) == 1){
                        startTime = plateOwnerCarNumberList.get(0).getEndTime();
                    }else{
                        startTime = plateRecordone.getiTime();
                    }
                }
            }

            // 已存在开始时间
            // 计算费用
            BigDecimal money = payMoney(startTime, devDistrictId);
            if(money.compareTo(new BigDecimal(0)) == 1){
                outMoneyOK(request, plateRecordone.getId(), oSerialno, money, heId, imageFile, imageFragmentFile);
                return false;
            }else{
                outOK(request, plateRecordone.getId(), oSerialno, heId, imageFile, imageFragmentFile);
                return true;
            }

        }
    }


    /**
     * 直接出口通行
     * @param id
     * @param serialno
     */
    public void outOK(HttpServletRequest request, int id, String serialno, int heId, String imageFile, String imageFragmentFile){
        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andIdEqualTo(id);

        PlateRecord plateRecord = new PlateRecord();
        plateRecord.setoSerialno(serialno);
        plateRecord.setoTime(new Date());
        plateRecord.setInOut("2");
        plateRecord.setBuildTime(new Date());

        String image = ImageUtil.getPlateImageUrl(request, heId, imageFile, fileUrl);
        if(image != null){
            plateRecord.setoImage(image);
        }

        String imageFragment = ImageUtil.getPlateImageUrl(request, heId, imageFragmentFile, fileUrl);
        if(imageFragment != null){
            plateRecord.setoImageFragment(imageFragment);
        }

        plateRecordDAO.updateByExampleSelective(plateRecord,plateRecordExample);

    }

    /**
     * 费用出口通行
     * @param id
     * @param serialno
     */
    public void outMoneyOK(HttpServletRequest request, int id, String serialno, BigDecimal money, int heId, String imageFile, String imageFragmentFile){

        PlateRecordExample plateRecordExampleO = new PlateRecordExample();
        PlateRecordExample.Criteria criteriaO =  plateRecordExampleO.createCriteria();

        criteriaO.andHeIdEqualTo(heId);
        criteriaO.andIdNotEqualTo(id);
        criteriaO.andIsDelEqualTo("0");
        criteriaO.andInOutEqualTo("4");

        PlateRecord plateRecordO = new PlateRecord();
        plateRecordO.setInOut("3");
        plateRecordO.setBuildTime(new Date());

        plateRecordDAO.updateByExampleSelective(plateRecordO,plateRecordExampleO);

        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andIdEqualTo(id);

        PlateRecord plateRecord = new PlateRecord();
        plateRecord.setoSerialno(serialno);
        plateRecord.setoTime(new Date());
        plateRecord.setInOut("4");
        plateRecord.setBuildTime(new Date());
        plateRecord.setMoney(money);

        String image = ImageUtil.getPlateImageUrl(request, heId, imageFile, fileUrl);
        if(image != null){
            plateRecord.setoImage(image);
        }

        String imageFragment = ImageUtil.getPlateImageUrl(request, heId, imageFragmentFile, fileUrl);
        if(imageFragment != null){
            plateRecord.setoImageFragment(imageFragment);
        }


        int pid = plateRecordDAO.updateByExampleSelective(plateRecord,plateRecordExample);
        if(pid > 0){
            // 存储对应的订单id  //等待小程序查询对应的金额，并支付开闸
            redisUtil.set("plate_pay_" + serialno, id);
        }
    }

    /**
     * 根据时间间隔
     * @param startTime
     * @param devDistrictId
     * @return
     */
    public BigDecimal payMoney(Date startTime, int devDistrictId){

        int hour = (int)DateUtils.getDateHour(new Date(), startTime, 1);

        int min = (int)DateUtils.getDateHour(new Date(), startTime, 2);

        PlateFeesConfigExample plateFeesConfigExample = new PlateFeesConfigExample();
        PlateFeesConfigExample.Criteria criteria = plateFeesConfigExample.createCriteria();
        criteria.andDevDistrictIdEqualTo(devDistrictId);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");

        List<PlateFeesConfig> plateFeesConfigList = plateFeesConfigDAO.selectByExample(plateFeesConfigExample);

        for (PlateFeesConfig plateFeesConfig : plateFeesConfigList) {
            if(plateFeesConfig.getMaxTime() == 0 && min > plateFeesConfig.getMinTime() * 60){
                return plateFeesConfig.getMoney();
            }else if(plateFeesConfig.getMaxTime() * 60 >= min && min > plateFeesConfig.getMinTime() * 60){
                return plateFeesConfig.getMoney();
            }
        }
        return new BigDecimal(0);
    }




    public void delPlateRecordAndFileImage(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<String> inouts = new ArrayList<>();
        inouts.add("2");
        inouts.add("3");
        inouts.add("4");

        Calendar c = Calendar.getInstance();

        //过去一月
        c.setTime(new Date());
        c.add(Calendar.DATE, -15);
        Date m = c.getTime();

        PlateRecordExample plateRecordExample = new PlateRecordExample();
        PlateRecordExample.Criteria criteria = plateRecordExample.createCriteria();
        criteria.andBuildTimeLessThanOrEqualTo(m);
        criteria.andInOutIn(inouts);

        List<PlateRecord> plateRecords = plateRecordDAO.selectByExample(plateRecordExample);

        if(plateRecords.size() > 0){
            for (PlateRecord plateRecord : plateRecords) {
                if(plateRecord.getiImage() != null){
                    fileDel(plateRecord.getiImage());
                }
                if(plateRecord.getiImageFragment() != null){
                    fileDel(plateRecord.getiImageFragment());
                }
                if(plateRecord.getoImage() != null){
                    fileDel(plateRecord.getoImage());
                }
                if(plateRecord.getoImageFragment() != null){
                    fileDel(plateRecord.getoImageFragment());
                }
            }
        }

//        plateRecordDAO.deleteByExample(plateRecordExample);
    }

    public void fileDel(String path){
        String[] iImage = path.split("image/");
        if(iImage.length == 2){
            String imgUrl = fileUrl + iImage[1];
            File file = new File(imgUrl);
            if(file.exists()) {
                try {
                    IOUtils.deleteFile(imgUrl);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}
