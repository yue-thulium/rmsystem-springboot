package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Road_surface_tableMapper;
import com.wuyue.rmsystem.model.Road_surface_information;
import com.wuyue.rmsystem.model.Routine_patrol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Road_surface_tableService {
    @Autowired
    Road_surface_tableMapper road_surface_tableMapper;
    public void addRST(Road_surface_information rsi){
        road_surface_tableMapper.addRST(rsi);
    }
    public void deleteRST(Road_surface_information rsi){
        road_surface_tableMapper.deleteRST(rsi);
    }
    public void updateRST(Road_surface_information rsi){
        road_surface_tableMapper.updateRST(rsi);
    }
    public List<Road_surface_information> getRST(){
        return road_surface_tableMapper.getRST();
    }
    public List<Road_surface_information> getRPbyRoad(int road_code, String history, String toady){
        return road_surface_tableMapper.getRPbyRoad(road_code,history,toady);
    }
}
