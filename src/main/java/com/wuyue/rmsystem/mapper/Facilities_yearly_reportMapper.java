package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Road_surface_information;
import com.wuyue.rmsystem.model.Year_Facility_report;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Facilities_yearly_reportMapper {
    int addFYR(Year_Facility_report year_facility_report);
    int deleteFYR(Year_Facility_report year_facility_report);
    int updateFYR(Year_Facility_report year_facility_report);
    List<Year_Facility_report> getFYR();
    List<Road_surface_information> getIRI(int road_code);
}
