package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Road_car_tableMapper;
import com.wuyue.rmsystem.model.Roadway_Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Road_car_tableService {
    @Autowired
    Road_car_tableMapper road_car_tableMapper;
    public void addRCT(Roadway_Information ri){
        road_car_tableMapper.addRCT(ri);
    }
    public void deleteRCT(Roadway_Information ri){
        road_car_tableMapper.deleteRCT(ri);
    }
    public void updateRCT(Roadway_Information ri){
        road_car_tableMapper.updateRCT(ri);
    }
    public List<Roadway_Information> getRCT(){
        return road_car_tableMapper.getRCT();
    }
}
