package com.wuyue.rmsystem.controller;

import com.wuyue.rmsystem.model.*;
import com.wuyue.rmsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/rc")
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
//regular_date,regular_type
    @RequestMapping(value = "/addRoad", method = RequestMethod.POST)
    public void addRoad(Road_Basic_Table rbt) {
        road_basic_tableService.addRBT(rbt);
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
    @RequestMapping(value = "/getRoad_sidewalk", method = RequestMethod.GET)
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
    @RequestMapping(value = "/getRoad_car", method = RequestMethod.GET)
    public Map<String, Object> getRoad_Car(int road_code){
        Map<String, Object> map = new HashMap<>();
        List<Roadway_Information> roadway_informations=road_car_tableService.getRCT(road_code);
        map.put("tabledata",roadway_informations);
        return map;
    }

}
