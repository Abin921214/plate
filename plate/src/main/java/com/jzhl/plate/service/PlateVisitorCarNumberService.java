package com.jzhl.plate.service;

import com.jzhl.plate.bean.BaseResult;
import com.jzhl.plate.mapper.PlateOwnerCarNumberDAO;
import com.jzhl.plate.mapper.PlateVisitorCarNumberDAO;
import com.jzhl.plate.model.PlateOwnerCarNumber;
import com.jzhl.plate.model.PlateOwnerCarNumberExample;
import com.jzhl.plate.model.PlateVisitorCarNumber;
import com.jzhl.plate.model.PlateVisitorCarNumberExample;
import com.jzhl.plate.utils.DateUtils;
import com.jzhl.plate.utils.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PlateVisitorCarNumberService {

    @Resource
    PlateVisitorCarNumberDAO plateVisitorCarNumberDAO;


    /**
     * 根据车牌过期时间删除对应的过期访客时间
     */
    public void updateVisitorCar(){
        PlateVisitorCarNumberExample plateVisitorCarNumberExample = new PlateVisitorCarNumberExample();
        PlateVisitorCarNumberExample.Criteria criteria = plateVisitorCarNumberExample.createCriteria();
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        List<PlateVisitorCarNumber> plateVisitorCarNumberList = plateVisitorCarNumberDAO.selectByExample(plateVisitorCarNumberExample);
        for (PlateVisitorCarNumber plateVisitorCarNumber : plateVisitorCarNumberList) {
            if(DateUtils.compare_date(new Date(), plateVisitorCarNumber.getEndTime()) == 1){
                updateByExampleSelective(plateVisitorCarNumber.getId());
            }
        }
    }

    public void updateByExampleSelective(Integer id){
        PlateVisitorCarNumberExample plateVisitorCarNumberExample = new PlateVisitorCarNumberExample();
        PlateVisitorCarNumberExample.Criteria criteria = plateVisitorCarNumberExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        PlateVisitorCarNumber plateVisitorCarNumber = new PlateVisitorCarNumber();
        plateVisitorCarNumber.setIsDel("1");
        plateVisitorCarNumber.setUpdateTime(new Date());

        plateVisitorCarNumberDAO.updateByExampleSelective(plateVisitorCarNumber, plateVisitorCarNumberExample);
    }


    /**
     * 访客车牌列表 (有效车牌)
     * @param memberId
     * @param heId
     * @param companyId
     * @return
     */
    public BaseResult vistorCarList(Integer memberId, Integer heId, Integer companyId){
        if(memberId == null || heId == null || companyId == null){
            return new BaseResult("0", "必传不能为空", null);
        }

        PlateVisitorCarNumberExample plateVisitorCarNumberExample = new PlateVisitorCarNumberExample();
        PlateVisitorCarNumberExample.Criteria criteria = plateVisitorCarNumberExample.createCriteria();
        criteria.andMemberIdEqualTo(memberId);
        criteria.andHeIdEqualTo(heId);
        criteria.andCompanyIdEqualTo(companyId);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        plateVisitorCarNumberExample.setOrderByClause("build_time desc");

        List<PlateVisitorCarNumber> plateVisitorCarNumberList = plateVisitorCarNumberDAO.selectByExample(plateVisitorCarNumberExample);

        return new BaseResult("1", "ok", plateVisitorCarNumberList);
    }

    /**
     * 添加访客车牌
     * @param heId
     * @param companyId
     * @param carNum
     * @param memberId
     * @param mobile
     * @param name
     * @return
     */
    public BaseResult addVisitorCarNum(Integer heId, Integer companyId, String carNum, Integer memberId, String mobile, String name){
        if(name == null ||  memberId == null || mobile == null ||  heId == null || companyId == null || carNum == null){
            return new BaseResult("0", "必传不能为空", null);
        }

        if(!StringUtils.isPhone(mobile)){
            return new BaseResult("0", "请输入正确的手机号", null);
        }

        if(!StringUtils.checkPlateNumberFormat(carNum.replace(" ","").trim())){
            return new BaseResult("0", "请输入正确的车牌号", null);
        }

        PlateVisitorCarNumberExample plateVisitorCarNumberExample = new PlateVisitorCarNumberExample();
        PlateVisitorCarNumberExample.Criteria criteria = plateVisitorCarNumberExample.createCriteria();
        criteria.andCarNumberEqualTo(carNum);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");
        List<PlateVisitorCarNumber> plateVisitorCarNumberList = plateVisitorCarNumberDAO.selectByExample(plateVisitorCarNumberExample);
        if(plateVisitorCarNumberList.size() > 0){
            return new BaseResult("0", "临时车牌已存在, 请勿重复添加", null);
        }

        PlateVisitorCarNumber plateVisitorCarNumber = new PlateVisitorCarNumber();
        plateVisitorCarNumber.setHeId(heId);
        plateVisitorCarNumber.setCarNumber(carNum);
        plateVisitorCarNumber.setCompanyId(companyId);
        plateVisitorCarNumber.setMemberId(memberId);
        plateVisitorCarNumber.setMobile(mobile);
        plateVisitorCarNumber.setName(name);
        plateVisitorCarNumber.setStartTime(new Date());
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());//设置起时间
        cal.add(Calendar.DATE, 5);//增加7天
        plateVisitorCarNumber.setEndTime(cal.getTime());
        plateVisitorCarNumber.setBuildTime(new Date());

        int id = plateVisitorCarNumberDAO.insertSelective(plateVisitorCarNumber);
        if(id > 0){
            return new BaseResult("1", "临时车牌添加成功", null);
        }

        return new BaseResult("0", "临时车牌添加失败", null);

    }

    /**
     * 根据车牌和小区查询对应的信息
     * @param license
     * @param heId
     * @return
     */
    public PlateVisitorCarNumber selectByExample(String license, Integer heId){

        PlateVisitorCarNumberExample plateVisitorCarNumberExample = new PlateVisitorCarNumberExample();
        PlateVisitorCarNumberExample.Criteria criteria = plateVisitorCarNumberExample.createCriteria();
        criteria.andCarNumberEqualTo(license);
        criteria.andHeIdEqualTo(heId);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        List<PlateVisitorCarNumber> plateVisitorCarNumberList = plateVisitorCarNumberDAO.selectByExample(plateVisitorCarNumberExample);
        if(plateVisitorCarNumberList.size() > 0){
            return  plateVisitorCarNumberList.get(0);
        }
        return null;
    }
}
