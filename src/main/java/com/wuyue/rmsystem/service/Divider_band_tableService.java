package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Divider_band_tableMapper;
import com.wuyue.rmsystem.model.Divider_band_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Divider_band_tableService {
    @Autowired
    Divider_band_tableMapper divider_band_tableMapper;
    public void addDBT(Divider_band_information dbi){
        divider_band_tableMapper.addDBT(dbi);
    }
    public void deleteDBT(Divider_band_information dbi){
        divider_band_tableMapper.deleteDBT(dbi);
    }
    public void updateDBT(Divider_band_information dbi){
        divider_band_tableMapper.updateDBT(dbi);
    }
    public List<Divider_band_information> getDBT(){
       return divider_band_tableMapper.getDBT();
    }
}
