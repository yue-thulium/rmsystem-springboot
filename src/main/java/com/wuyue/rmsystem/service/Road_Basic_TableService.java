package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Road_Basic_TableMapper;
import com.wuyue.rmsystem.model.Road_Basic_Table;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Road_Basic_TableService {
    @Autowired
    Road_Basic_TableMapper road_basic_tableMapper;
    public void addRBT(Road_Basic_Table rbt,String regular_type){
        road_basic_tableMapper.addRBT(rbt,regular_type);
    }
    public void deleteRBT(Road_Basic_Table rbt){
        road_basic_tableMapper.deleteRBT(rbt);
    }
    public void updateRBT(Road_Basic_Table rbt){
        road_basic_tableMapper.updateRBT(rbt);
    }
    public List<Road_Basic_Table> getRBT(String sort){
        return road_basic_tableMapper.getRBT(sort);
    }
    public int addDFN(int id) {
        return road_basic_tableMapper.addDFN(id);
    }
    public int deleteDFN(int id) {
        return road_basic_tableMapper.deleteDFN(id);
    }
    public int changeState(Road_Basic_Table road_basic_table) {
       return road_basic_tableMapper.changeState(road_basic_table);
    }
    public List<Road_Basic_Table> getRBTall(){
        return road_basic_tableMapper.getRBTall();
    }
}
