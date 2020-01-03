package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Sidewalk_information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Sidewalk_tableMapper {
    int addST(Sidewalk_information sidewalk_information);
    int deleteST(Sidewalk_information sidewalk_information);
    int updateST(Sidewalk_information sidewalk_information);
    List<Sidewalk_information> getST();
}
