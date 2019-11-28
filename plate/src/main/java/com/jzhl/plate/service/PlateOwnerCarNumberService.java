package com.jzhl.plate.service;

import com.jzhl.plate.bean.BaseResult;
import com.jzhl.plate.mapper.PlateOwnerCarNumberDAO;
import com.jzhl.plate.mapper.PlateVisitorCarNumberDAO;
import com.jzhl.plate.model.PlateOwnerCarNumber;
import com.jzhl.plate.model.PlateOwnerCarNumberExample;
import com.jzhl.plate.model.PlateVisitorCarNumber;
import com.jzhl.plate.model.PlateVisitorCarNumberExample;
import com.jzhl.plate.utils.StringUtils;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PlateOwnerCarNumberService {

    @Resource
    PlateOwnerCarNumberDAO plateOwnerCarNumberDAO;


    /**
     * 删除某一个车牌用户
     * @param id
     * @return
     */
    public BaseResult delOwnerPlateNum(Integer id){
        if(id == null){
            return new BaseResult("0", "必传不能为空", null);
        }
        PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
        PlateOwnerCarNumberExample.Criteria criteria = plateOwnerCarNumberExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        List<PlateOwnerCarNumber> plateOwnerCarNumberList = plateOwnerCarNumberDAO.selectByExample(plateOwnerCarNumberExample);
        if(plateOwnerCarNumberList.size() <= 0){
            return new BaseResult("0", "记录不存在", null);
        }

        PlateOwnerCarNumber plateOwnerCarNumber = new PlateOwnerCarNumber();
        plateOwnerCarNumber.setIsDel("1");

        int pid = plateOwnerCarNumberDAO.updateByExampleSelective(plateOwnerCarNumber, plateOwnerCarNumberExample);
        if(pid > 0){
            return new BaseResult("1", "删除成功", null);
        }
        return new BaseResult("0", "删除失败", null);
    }

    /**
     * 给业主添加车牌
     * @param carNumber
     * @param memberId
     * @param mobile
     * @param name
     * @param heId
     * @param companyId
     * @return
     */
    public BaseResult addOwnerPlateCarNum(String carNumber, Integer memberId, String mobile, String name, Integer heId, Integer companyId){
        if(name == null || carNumber == null || memberId == null || mobile == null ||  heId == null || companyId == null){
            return new BaseResult("0", "必传不能为空", null);
        }

        if(!StringUtils.isPhone(mobile)){
            return new BaseResult("0", "请输入正确的手机号", null);
        }

        if(!StringUtils.checkPlateNumberFormat(carNumber.replace(" ","").trim())){
            return new BaseResult("0", "请输入正确的车牌号", null);
        }

        PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
        PlateOwnerCarNumberExample.Criteria criteria = plateOwnerCarNumberExample.createCriteria();
        criteria.andCarNumberEqualTo(carNumber.replace(" ","").trim());
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");
        List<PlateOwnerCarNumber> plateOwnerCarNumberList = plateOwnerCarNumberDAO.selectByExample(plateOwnerCarNumberExample);
        if(plateOwnerCarNumberList.size() > 0){
            return new BaseResult("0", "车牌已存在, 请勿重复添加", null);
        }

        PlateOwnerCarNumber plateOwnerCarNumber = new PlateOwnerCarNumber();
        plateOwnerCarNumber.setMemberId(memberId);
        plateOwnerCarNumber.setCarNumber(carNumber.replace(" ","").trim());
        plateOwnerCarNumber.setMobile(mobile);
        plateOwnerCarNumber.setName(name);
        plateOwnerCarNumber.setHeId(heId);
        plateOwnerCarNumber.setCompanyId(companyId);
        plateOwnerCarNumber.setBuildTime(new Date());
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());//设置起时间
        cal.add(Calendar.YEAR, 1);//增加一年
        plateOwnerCarNumber.setStartTime(cal.getTime());

        int id = plateOwnerCarNumberDAO.insertSelective(plateOwnerCarNumber);

        if(id <= 0){
            return new BaseResult("0", "添加车牌失败", null);
        }else{
            return new BaseResult("1", "添加车牌成功", null);
        }


    }


    /**
     * 批量给某用户绑定车牌信息
     * @param memberId
     * @param ids
     */
    public void updateByExampleSelective(Integer memberId, List<Integer> ids){

        PlateOwnerCarNumber plateOwnerCarNumber = new PlateOwnerCarNumber();
        plateOwnerCarNumber.setMemberId(memberId);

        PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
        PlateOwnerCarNumberExample.Criteria criteria = plateOwnerCarNumberExample.createCriteria();
        criteria.andIdIn(ids);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        plateOwnerCarNumberDAO.updateByExampleSelective(plateOwnerCarNumber, plateOwnerCarNumberExample);
    }


    public List<PlateOwnerCarNumber> selectByExampleAndMobile(String mobile){
        PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
        PlateOwnerCarNumberExample.Criteria criteria = plateOwnerCarNumberExample.createCriteria();
        criteria.andMobileEqualTo(mobile);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        return plateOwnerCarNumberDAO.selectByExample(plateOwnerCarNumberExample);
    }

    public List<PlateOwnerCarNumber> selectByExampleAndMemberId(Integer memberId, Integer heId, Integer companyId){
        PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
        PlateOwnerCarNumberExample.Criteria criteria = plateOwnerCarNumberExample.createCriteria();
        criteria.andMemberIdEqualTo(memberId);
        criteria.andHeIdEqualTo(heId);
        criteria.andCompanyIdEqualTo(companyId);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        plateOwnerCarNumberExample.setOrderByClause("build_time desc");

        return plateOwnerCarNumberDAO.selectByExample(plateOwnerCarNumberExample);
    }

    /**
     * 根据车牌和小区查询对应的信息
     * @param license
     * @param heId
     * @return
     */
    public PlateOwnerCarNumber selectByExample(String license, Integer heId){

        PlateOwnerCarNumberExample plateOwnerCarNumberExample = new PlateOwnerCarNumberExample();
        PlateOwnerCarNumberExample.Criteria criteria = plateOwnerCarNumberExample.createCriteria();
        criteria.andCarNumberEqualTo(license);
        criteria.andHeIdEqualTo(heId);
        criteria.andStatusEqualTo("0");
        criteria.andIsDelEqualTo("0");

        List<PlateOwnerCarNumber> plateOwnerCarNumberList = plateOwnerCarNumberDAO.selectByExample(plateOwnerCarNumberExample);
        if(plateOwnerCarNumberList.size() > 0){
            return  plateOwnerCarNumberList.get(0);
        }
        return null;
    }
}
