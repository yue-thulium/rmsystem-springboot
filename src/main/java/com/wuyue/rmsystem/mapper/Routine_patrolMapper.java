package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Road_Basic_Table;
import com.wuyue.rmsystem.model.Routine_patrol;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface Routine_patrolMapper {
    int addRP(Routine_patrol dfn);
    int deleteRP(Routine_patrol dfn);
    int updateRP(Routine_patrol dfn);
    List<Routine_patrol> getRP();
    List<Routine_patrol> getRPbyRoad(@Param("road_code")int road_code, @Param("history")String history, @Param("today")String today);
}
