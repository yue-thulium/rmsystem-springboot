package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Road_damage_tableMapper;
import com.wuyue.rmsystem.model.Road_damage_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Road_damage_tableService {
    @Autowired
    Road_damage_tableMapper road_damage_tableMapper;
    public void addRDT(Road_damage_information rdi){
        road_damage_tableMapper.addRDT(rdi);
    }
    public void deleteRDT(Road_damage_information rdi){
        road_damage_tableMapper.deleteRDT(rdi);
    }
    public void updateRDT(Road_damage_information rdi){
        road_damage_tableMapper.updateRDT(rdi);
    }
    public List<Road_damage_information> getRDT(){
        return road_damage_tableMapper.getRDT();
    }
    public List<Road_damage_information> getRPbyRoad(String road_name, String history, String toady){
        return road_damage_tableMapper.getRPbyRoad(road_name,history,toady);
    }
}
