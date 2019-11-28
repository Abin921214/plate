package com.jzhl.plate.service;

import com.jzhl.plate.mapper.PlateConfigDAO;
import com.jzhl.plate.model.PlateConfig;
import com.jzhl.plate.model.PlateConfigExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlateConfigService {

    @Resource
    PlateConfigDAO plateConfigDAO;

    /**
     * 获取小区配置信息
     * @param devDistrictId
     * @return
     */
    public PlateConfig selectByExample(int devDistrictId){

        PlateConfigExample plateConfigExample = new PlateConfigExample();
        PlateConfigExample.Criteria criteria = plateConfigExample.createCriteria();
        criteria.andDevDistrictIdEqualTo(devDistrictId);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");

        List<PlateConfig> plateConfigList = plateConfigDAO.selectByExample(plateConfigExample);
        if(plateConfigList.size() > 0){
            return plateConfigList.get(0);
        }
        return null;
    }


    /**
     * 更新车牌信息
     * @param devDistrictId
     * @param num
     * @param type
     */
    public void updateByExampleSelective(int devDistrictId, int num, String type){

        PlateConfigExample plateConfigExample = new PlateConfigExample();
        PlateConfigExample.Criteria criteria = plateConfigExample.createCriteria();
        criteria.andDevDistrictIdEqualTo(devDistrictId);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");

        PlateConfig plateConfig = new PlateConfig();
        if(type.equals("add")){
            plateConfig.setCarNumber(num + 1);
        }else if(type.equals("del") && num != 0){
            plateConfig.setCarNumber(num - 1);
        }else{
            plateConfig.setCarNumber(num);
        }

        plateConfigDAO.updateByExampleSelective(plateConfig, plateConfigExample);
    }

}
