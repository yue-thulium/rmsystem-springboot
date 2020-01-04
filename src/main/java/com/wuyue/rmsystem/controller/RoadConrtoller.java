package com.wuyue.rmsystem.controller;

import com.wuyue.rmsystem.model.*;
import com.wuyue.rmsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Road道路信息增删查改
 * 道路检测
 * path路由说明：
 *  类上标注"/r" ： 代表道路
 *  方法标注格式为 ： "/道路增加（addRoad）/道路修改（updateRoad） /道路查询(getRoad) /道路删除(deleteRoad)"
 */
@RestController
@RequestMapping("/road")
public class RoadConrtoller {
    @Autowired
    Road_Basic_TableService road_basic_tableService;
    @Autowired
    Sidewalk_tableService sidewalk_tableService;
    @Autowired
    Road_car_tableService road_car_tableService;
    @Autowired
    Divider_band_tableService divider_band_tableService;
    @Autowired
    Facilities_tableService facilities_tableService;
    @Autowired
    Facilities_yearly_reportService facilities_yearly_reportService;
//regular_date,regular_type
    @RequestMapping(value = "/addRoad", method = RequestMethod.POST)
    public void addRoad(Road_Basic_Table rbt) {
        road_basic_tableService.addRBT(rbt);
        facilities_yearly_reportService.addFYR(insert_YFR(rbt.getRoad_code(),rbt.getRoad_name()));
    }

    @RequestMapping(value = "/updateRoad", method = RequestMethod.POST)
    public void updateRoad(Road_Basic_Table rbt) {
        road_basic_tableService.updateRBT(rbt);
    }

    @RequestMapping(value = "/getRoad", method = RequestMethod.GET)
    public Map<String, Object> getRoad(){
        Map<String, Object> map = new HashMap<>();
        List<Road_Basic_Table> road_basic_tables=road_basic_tableService.getRBTall();
        map.put("tabledata",road_basic_tables);
        return map;
    }
    @RequestMapping(value = "/getRBTbyroad",method = RequestMethod.POST)
    public Map<String,Object> getRBTbyroad(int road_code){
        Map<String, Object> map = new HashMap<>();
        List<Road_Basic_Table> road_basic_tables=road_basic_tableService.getRBTbyroad(road_code);
        map.put("tabledata",road_basic_tables);
        return map;
    }
    @RequestMapping(value = "/deleteRoad", method = RequestMethod.POST)
    public void deleteRoad(Road_Basic_Table rbt){
        road_basic_tableService.deleteRBT(rbt);
    }

    @RequestMapping(value = "/addRoad_sidewalk", method = RequestMethod.POST)
    public void addRoadSidewalk(Sidewalk_information si) {
        sidewalk_tableService.addST(si);
    }

    @RequestMapping(value = "/updateRoad_sidewalk", method = RequestMethod.POST)
    public void updateRoadSidedwalk(Sidewalk_information si) {
        sidewalk_tableService.updateST(si);
    }

    @RequestMapping(value = "/getRoad_sidewalk", method = RequestMethod.POST)
    public Map<String, Object> getRoadSidewalk(int road_code){
        Map<String, Object> map = new HashMap<>();
        List<Sidewalk_information> sidewalk_informations=sidewalk_tableService.getST(road_code);
        map.put("tabledata",sidewalk_informations);
        return map;
    }

    @RequestMapping(value = "/addRoad_car", method = RequestMethod.POST)
    public void addRoad_Car(Roadway_Information si) {
        road_car_tableService.addRCT(si);
    }

    @RequestMapping(value = "/updateRoad_car", method = RequestMethod.POST)
    public void updateRoad_Car(Roadway_Information si) {
        road_car_tableService.updateRCT(si);
    }

    @RequestMapping(value = "/getRoad_car", method = RequestMethod.POST)
    public Map<String, Object> getRoad_Car(int road_code){
        Map<String, Object> map = new HashMap<>();
        List<Roadway_Information> roadway_informations=road_car_tableService.getRCT(road_code);
        map.put("tabledata",roadway_informations);
        return map;
    }

    @RequestMapping(value = "/addRoad_divider", method = RequestMethod.POST)
    public void addRoad_Divider(Divider_band_information si) {
        divider_band_tableService.addDBT(si);
    }

    @RequestMapping(value = "/updateRoad_divider", method = RequestMethod.POST)
    public void updateRoad_Divider(Divider_band_information si) {
        divider_band_tableService.updateDBT(si);
    }

    @RequestMapping(value = "/getRoad_divider", method = RequestMethod.POST)
    public Map<String, Object> getRoad_Divider(int road_code){
        Map<String, Object> map = new HashMap<>();
        List<Divider_band_information> divider_band_informations=divider_band_tableService.getDBT(road_code);
        map.put("tabledata",divider_band_informations);
        return map;
    }

    @RequestMapping(value = "/addRoad_faclities", method = RequestMethod.POST)
    public void addRoad_Facilities(Facilities_information si) {
        facilities_tableService.addFT(si);
    }

    @RequestMapping(value = "/updateRoad_faclities", method = RequestMethod.POST)
    public void updateRoad_Facilities(Facilities_information si) {
        facilities_tableService.addFT(si);
    }

    @RequestMapping(value = "/getRoad_faclities", method = RequestMethod.POST)
    public Map<String, Object> getRoad_Facilities(int road_code){
        Map<String, Object> map = new HashMap<>();
        List<Facilities_information> facilities_informations=facilities_tableService.getFT(road_code);
        map.put("tabledata",facilities_informations);
        return map;
    }
    /**
     * 道路年报
     */
    @RequestMapping(value="/getfacilities_yearly_report",method = RequestMethod.GET)
    public Map<String, Object> getfacilities_yearly_report(){
        Map<String, Object> map = new HashMap<>();
        List<Year_Facility_report> year_facility_reports=facilities_yearly_reportService.getFYR();
        map.put("tabledata",year_facility_reports);
        return map;
    }
    private Year_Facility_report insert_YFR(int road_code,String  road_name){
        Date date = new Date(System.currentTimeMillis());
        List<Road_surface_information> road_surface_informations=facilities_yearly_reportService.getIRI(road_code);
        Year_Facility_report yfr=new Year_Facility_report();
        yfr.setRoad_name(road_name);
        return yfr;
    }
}
