package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Facilities_information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Facilities_tableMapper {
    int addFT(Facilities_information facilities_information);
    int deleteFT(Facilities_information facilities_information);
    int updateFT(Facilities_information facilities_information);
    List<Facilities_information> getFT();
}
