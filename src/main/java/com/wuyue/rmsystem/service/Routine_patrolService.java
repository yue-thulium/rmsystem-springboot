package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Routine_patrolMapper;
import com.wuyue.rmsystem.model.Road_Basic_Table;
import com.wuyue.rmsystem.model.Routine_patrol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class Routine_patrolService {
    @Autowired
    Routine_patrolMapper routine_patrolMapper;
    public void addRP(Routine_patrol rp){
        routine_patrolMapper.addRP(rp); }
    public void deleteRP(Routine_patrol rp){
        routine_patrolMapper.deleteRP(rp);
    }
    public void updateRP(Routine_patrol rp){
        routine_patrolMapper.updateRP(rp);
    }
    public List<Routine_patrol> getRP(){
        return routine_patrolMapper.getRP();
    }
    public List<Routine_patrol> getRPbyRoad(int road_code, String history, String toady){
        return routine_patrolMapper.getRPbyRoad(road_code,history,toady);
    }
}
