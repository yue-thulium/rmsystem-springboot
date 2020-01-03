package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Sidewalk_tableMapper;
import com.wuyue.rmsystem.model.Sidewalk_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Sidewalk_tableService {
    @Autowired
    Sidewalk_tableMapper sidewalk_tableMapper;
    public void addST(Sidewalk_information si){
        sidewalk_tableMapper.addST(si);
    }
    public void deleteST(Sidewalk_information si){
        sidewalk_tableMapper.deleteST(si);
    }
    public void updateST(Sidewalk_information si){
        sidewalk_tableMapper.updateST(si);
    }
    public List<Sidewalk_information> getST(int road_code){
        return sidewalk_tableMapper.getST(road_code);
    }
}
