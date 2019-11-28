package com.jzhl.plate.service;


import com.jzhl.plate.mapper.PlateFeesConfigDAO;
import com.jzhl.plate.model.PlateFeesConfig;
import com.jzhl.plate.model.PlateFeesConfigExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlateFeeConfigService {

    @Resource
    PlateFeesConfigDAO plateFeesConfigDAO;

    public List<PlateFeesConfig> getPlateFeesConfig(Integer devDistrictId){
        PlateFeesConfigExample plateFeesConfigExample = new PlateFeesConfigExample();
        PlateFeesConfigExample.Criteria criteria = plateFeesConfigExample.createCriteria();
        criteria.andDevDistrictIdEqualTo(devDistrictId);
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");

        return plateFeesConfigDAO.selectByExample(plateFeesConfigExample);
    }

}
