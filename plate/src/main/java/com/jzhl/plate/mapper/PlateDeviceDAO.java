package com.jzhl.plate.mapper;

import com.jzhl.plate.model.PlateDevice;
import com.jzhl.plate.model.PlateDeviceExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PlateDeviceDAO继承基类
 */
@Mapper
public interface PlateDeviceDAO extends MyBatisBaseDao<PlateDevice, Integer, PlateDeviceExample> {
}