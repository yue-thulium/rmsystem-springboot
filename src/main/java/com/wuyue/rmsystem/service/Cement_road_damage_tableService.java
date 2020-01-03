package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Cement_road_damage_tableMapper;
import com.wuyue.rmsystem.model.CementRoad_pavement_damage_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Cement_road_damage_tableService {
    @Autowired
    Cement_road_damage_tableMapper cement_road_damage_tableMapper;
   public void addCRDT(CementRoad_pavement_damage_information cpdi){
        cement_road_damage_tableMapper.addCRDT(cpdi);
    }
   public void deleteCRDT(CementRoad_pavement_damage_information cpdi){
        cement_road_damage_tableMapper.deleteCRDT(cpdi);
    }
   public List<CementRoad_pavement_damage_information> getCRDT(){
       return cement_road_damage_tableMapper.getCRDT();
    }
   public void updateCRDT(CementRoad_pavement_damage_information cpdi){
        cement_road_damage_tableMapper.updateCRDT(cpdi);
    }
}
