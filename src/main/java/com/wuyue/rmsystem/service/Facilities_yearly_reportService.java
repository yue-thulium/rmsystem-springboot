package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Facilities_yearly_reportMapper;
import com.wuyue.rmsystem.model.Road_surface_information;
import com.wuyue.rmsystem.model.Year_Facility_report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Facilities_yearly_reportService {
    @Autowired
    Facilities_yearly_reportMapper facilities_yearly_reportMapper;
    public void addFYR(Year_Facility_report yfr){
        facilities_yearly_reportMapper.addFYR(yfr);
    }
    public void deleteFYR(Year_Facility_report yfr){
        facilities_yearly_reportMapper.deleteFYR(yfr);
    }
    public void updateFYR(Year_Facility_report yfr){
        facilities_yearly_reportMapper.updateFYR(yfr);
    }
    public List<Year_Facility_report> getFYR(){
        return facilities_yearly_reportMapper.getFYR();
    }
    public List<Road_surface_information> getIRI(int road_code){
        return facilities_yearly_reportMapper.getIRI(road_code);
    }
}
