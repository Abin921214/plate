package com.jzhl.plate.mapper;

import com.jzhl.plate.model.PlateVisitorCarNumber;
import com.jzhl.plate.model.PlateVisitorCarNumberExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PlateVisitorCarNumberDAO继承基类
 */
@Mapper
public interface PlateVisitorCarNumberDAO extends MyBatisBaseDao<PlateVisitorCarNumber, Integer, PlateVisitorCarNumberExample> {
}