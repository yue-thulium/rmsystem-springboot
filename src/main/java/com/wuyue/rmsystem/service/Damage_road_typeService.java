package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Damage_road_typeMapper;
import com.wuyue.rmsystem.model.Damage_road_type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Damage_road_typeService {
    @Autowired
    Damage_road_typeMapper damage_road_typeMapper;
   public void addDRT(Damage_road_type drt){
        damage_road_typeMapper.addDRT(drt);
    }
    public void deleteDRT(Damage_road_type drt){
       damage_road_typeMapper.deleteDRT(drt);
    }
    public void updateDRT(Damage_road_type drt){
       damage_road_typeMapper.updateDRT(drt);
    }
    public List<Damage_road_type> getDRT(){
      return damage_road_typeMapper.getDRT();
    }
}
