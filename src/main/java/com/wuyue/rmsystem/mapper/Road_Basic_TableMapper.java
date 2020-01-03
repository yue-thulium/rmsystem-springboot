package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Road_Basic_Table;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Road_Basic_TableMapper {
    int addRBT(Road_Basic_Table road_basic_table);
    int deleteRBT(Road_Basic_Table road_basic_table);
    int updateRBT(Road_Basic_Table road_basic_table);
    List<Road_Basic_Table> getRBT(String store);
    int addDFN(int id);
    int deleteDFN(int id);
    List<Road_Basic_Table> getRBTall();
    int changeState(Road_Basic_Table road_basic_table);
}
