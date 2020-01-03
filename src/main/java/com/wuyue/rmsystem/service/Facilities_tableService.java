package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Facilities_tableMapper;
import com.wuyue.rmsystem.model.Facilities_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Facilities_tableService {
    @Autowired
    Facilities_tableMapper facilities_tableMapper;
    public void addFT(Facilities_information fi){
        facilities_tableMapper.addFT(fi);
    }
    public void deleteFT(Facilities_information fi){
        facilities_tableMapper.deleteFT(fi);
    }
    public void updateFT(Facilities_information fi){
        facilities_tableMapper.updateFT(fi);
    }
    public List<Facilities_information> getFT(int road_code){
        return facilities_tableMapper.getFT(road_code);
    }
}
