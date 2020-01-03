package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Damage_road_type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Damage_road_typeMapper {
    int addDRT(Damage_road_type damage_road_type);
    int deleteDRT(Damage_road_type damage_road_type);
    int updateDRT(Damage_road_type damage_road_type);
    List<Damage_road_type> getDRT();
}
