package com.jzhl.plate.mapper;

import com.jzhl.plate.model.PlateConfig;
import com.jzhl.plate.model.PlateConfigExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PlateConfigDAO继承基类
 */
@Mapper
public interface PlateConfigDAO extends MyBatisBaseDao<PlateConfig, Integer, PlateConfigExample> {
}