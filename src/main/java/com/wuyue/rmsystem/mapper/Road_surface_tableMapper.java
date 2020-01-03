package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Road_surface_information;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Road_surface_tableMapper {
    int addRST(Road_surface_information road_surface_information);
    int deleteRST(Road_surface_information road_surface_information);
    int updateRST(Road_surface_information road_surface_information);
    List<Road_surface_information> getRST();
    List<Road_surface_information> getRPbyRoad(@Param("road_name")String road_name, @Param("history")String history, @Param("today")String today);
}
