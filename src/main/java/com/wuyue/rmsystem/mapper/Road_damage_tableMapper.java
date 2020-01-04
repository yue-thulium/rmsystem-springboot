package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Road_damage_information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Road_damage_tableMapper {
    int addRDT(Road_damage_information road_damage_information);
    int deleteRDT(Road_damage_information road_damage_information);
    int updateRDT(Road_damage_information road_damage_information);
    List<Road_damage_information> getRDT();
    List<Road_damage_information> getRPbyRoad(@Param("road_name")String road_name, @Param("history")String history, @Param("today")String today);
    int update_insert_APT(Road_damage_information road_damage_information);
}
