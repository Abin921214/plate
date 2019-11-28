package com.jzhl.plate.mapper;

import com.jzhl.plate.model.PlateOwnerCarNumber;
import com.jzhl.plate.model.PlateOwnerCarNumberExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PlateOwnerCarNumberDAO继承基类
 */
@Mapper
public interface PlateOwnerCarNumberDAO extends MyBatisBaseDao<PlateOwnerCarNumber, Integer, PlateOwnerCarNumberExample> {
}