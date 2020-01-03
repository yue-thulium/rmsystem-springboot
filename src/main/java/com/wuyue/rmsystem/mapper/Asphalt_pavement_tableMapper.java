package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Asphalt_pavement_damage_information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Asphalt_pavement_tableMapper {
    int addAPT(Asphalt_pavement_damage_information asphalt_pavement_damage_information);
    int deleteAPT(Asphalt_pavement_damage_information asphalt_pavement_damage_information);
    List<Asphalt_pavement_damage_information> getAPT();
    int updateAPT(Asphalt_pavement_damage_information asphalt_pavement_damage_information);
}
