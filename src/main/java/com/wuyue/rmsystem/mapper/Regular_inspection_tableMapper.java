package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Regular_inspection_information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Regular_inspection_tableMapper {
    int addRIT(Regular_inspection_information regular_inspection_information);
    int deleteRIT(Regular_inspection_information regular_inspection_information);
    int updateRIT(Regular_inspection_information regular_inspection_information);
    List<Regular_inspection_information> getRIT();
}
