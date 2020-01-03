package com.wuyue.rmsystem.mapper;


import com.wuyue.rmsystem.model.Road_damage_information;
import com.wuyue.rmsystem.model.Roadway_Information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Road_car_tableMapper {
    int addRCT(Roadway_Information roadway_information);
    int deleteRCT(Roadway_Information road_damage_information);
    int updateRCT(Roadway_Information road_damage_information);
    List<Roadway_Information> getRCT(int road_code);
}
