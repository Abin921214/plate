package com.jzhl.plate.mapper;

import com.jzhl.plate.model.PlateRecord;
import com.jzhl.plate.model.PlateRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PlateRecordDAO继承基类
 */
@Mapper
public interface PlateRecordDAO extends MyBatisBaseDao<PlateRecord, Integer, PlateRecordExample> {
}