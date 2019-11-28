package com.jzhl.plate.mapper;

import com.jzhl.plate.model.PlateDeviceLog;
import com.jzhl.plate.model.PlateDeviceLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PlateDeviceLogDAO继承基类
 */
@Mapper
public interface PlateDeviceLogDAO extends MyBatisBaseDao<PlateDeviceLog, Integer, PlateDeviceLogExample> {
}