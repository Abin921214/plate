package com.jzhl.plate.mapper;

import com.jzhl.plate.model.PlateFeesConfig;
import com.jzhl.plate.model.PlateFeesConfigExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PlateFeesConfigDAO继承基类
 */
@Mapper
public interface PlateFeesConfigDAO extends MyBatisBaseDao<PlateFeesConfig, Integer, PlateFeesConfigExample> {
}