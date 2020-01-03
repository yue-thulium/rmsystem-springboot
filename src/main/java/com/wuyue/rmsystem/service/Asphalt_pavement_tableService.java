package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Asphalt_pavement_tableMapper;
import com.wuyue.rmsystem.model.Asphalt_pavement_damage_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Asphalt_pavement_tableService {
    @Autowired
    Asphalt_pavement_tableMapper asphalt_pavement_tableMapper;
   public void addAPT(Asphalt_pavement_damage_information apdi){
        asphalt_pavement_tableMapper.addAPT(apdi);
    }
   public void deleteAPT(Asphalt_pavement_damage_information apdi){
        asphalt_pavement_tableMapper.deleteAPT(apdi);
    }
   public List<Asphalt_pavement_damage_information> getAPT() {
       return asphalt_pavement_tableMapper.getAPT();
    }
   public void updateAPT(Asphalt_pavement_damage_information apdi){
        asphalt_pavement_tableMapper.updateAPT(apdi);
    }
}
