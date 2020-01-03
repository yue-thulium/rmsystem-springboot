package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.CementRoad_pavement_damage_information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Cement_road_damage_tableMapper {
    int addCRDT(CementRoad_pavement_damage_information cementRoad_pavement_damage_information);
    int deleteCRDT(CementRoad_pavement_damage_information cementRoad_pavement_damage_information);
    List<CementRoad_pavement_damage_information> getCRDT();
    int updateCRDT(CementRoad_pavement_damage_information cementRoad_pavement_damage_information);
}
