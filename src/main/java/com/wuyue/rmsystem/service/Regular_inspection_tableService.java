package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Regular_inspection_tableMapper;
import com.wuyue.rmsystem.model.Regular_inspection_information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Regular_inspection_tableService {
    @Autowired
    Regular_inspection_tableMapper regular_inspection_tableMapper;
    public void addRIT(Regular_inspection_information rii){
        regular_inspection_tableMapper.addRIT(rii);
    }
    public void deleteRIT(Regular_inspection_information rii){
        regular_inspection_tableMapper.deleteRIT(rii);
    }
    public void updateRIT(Regular_inspection_information rii){
        regular_inspection_tableMapper.updateRIT(rii);
    }
    public List<Regular_inspection_information> getRIT(){
        return regular_inspection_tableMapper.getRIT();
    }
}
