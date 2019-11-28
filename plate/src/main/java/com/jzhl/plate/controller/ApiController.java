package com.jzhl.plate.controller;

import com.jzhl.plate.bean.BaseResult;
import com.jzhl.plate.model.PlateOwnerCarNumber;
import com.jzhl.plate.model.PlateVisitorCarNumber;
import com.jzhl.plate.service.PlateOwnerCarNumberService;
import com.jzhl.plate.service.PlateVisitorCarNumberService;
import com.jzhl.plate.utils.StringUtils;
import io.swagger.models.auth.In;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Resource
    PlateOwnerCarNumberService plateOwnerCarNumberService;

    @Resource
    PlateVisitorCarNumberService plateVisitorCarNumberService;


    /**
     * 查询注册app 用户对应的车牌信息列表
     * @param mobile   用户注册的手机号
     * @param memberId 用户ID
     * @param heId     项目ID（小区）
     * @param companyId 公司ID
     * @return
     */

    @RequestMapping( value = "/owner/car/list" , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE } , produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public BaseResult getMemberCar(String mobile, Integer memberId, Integer heId, Integer companyId){

        if(mobile == null || memberId == null || heId == null || companyId == null){
            return new BaseResult("0", "比传不能为空", null);
        }

        List<Integer> ids = new ArrayList<>();

        // 批量给某用户绑定车牌信息
        List<PlateOwnerCarNumber> plateOwnerCarNumberList = plateOwnerCarNumberService.selectByExampleAndMobile(mobile);
        if(plateOwnerCarNumberList.size() > 0){
            for (PlateOwnerCarNumber plateOwnerCarNumber : plateOwnerCarNumberList) {
                ids.add(plateOwnerCarNumber.getId());
            }
            if(ids.size() > 0){
                plateOwnerCarNumberService.updateByExampleSelective(memberId, ids);
            }
        }

        List<PlateOwnerCarNumber> plateOwnerCarNumbers = plateOwnerCarNumberService.selectByExampleAndMemberId(memberId, heId, companyId);

        return new BaseResult("1", "ok", plateOwnerCarNumbers);
    }


    /**
     * 访客车牌信息列表
     * @param memberId   app 用户ID
     * @param heId       项目Id（小区）
     * @param companyId  公司ID
     * @return
     */
    @RequestMapping( value = "/visitor/car/list" , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE } , produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public BaseResult vistorCarList(Integer memberId, Integer heId, Integer companyId){
        return plateVisitorCarNumberService.vistorCarList(memberId,heId,companyId);
    }

    /**
     * 添加车辆信息(业主车牌)
     * @param carNumber   车牌信息
     * @param memberId    app用户ID
     * @param mobile      车主联系方式
     * @param name        车主姓名
     * @param heId        项目ID(小区)
     * @param companyId   公司ID
     * @return
     */
    @RequestMapping( value = "/owner/add/carnum" , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE } , produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public BaseResult addOwnerPlateCarNum(String carNumber, Integer memberId, String mobile, String name, Integer heId, Integer companyId){
        return plateOwnerCarNumberService.addOwnerPlateCarNum(carNumber,memberId,mobile,name,heId,companyId);
    }

    /**
     * 删除车辆信息(业主车牌)
     * @param id
     * @return
     */
    @RequestMapping( value = "/owner/del/carnum" , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE } , produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public BaseResult delOwnerPlateCarNum(Integer carId){
        return plateOwnerCarNumberService.delOwnerPlateNum(carId);
    }

    /**
     * 添加车辆信息(访客车牌)
     * @param heId        项目ID(小区)
     * @param companyId   公司ID
     * @param carNum      车牌号
     * @param memberId    app 用户ID
     * @param mobile      手机号
     * @param name        名称
     * @return
     */
    @RequestMapping( value = "/visitor/carnum" , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE } , produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public BaseResult addVisitorCarNum(Integer heId, Integer companyId, String carNum, Integer memberId, String mobile, String name){
        return plateVisitorCarNumberService.addVisitorCarNum(heId,companyId,carNum,memberId,mobile,name);
    }




}
