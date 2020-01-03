package com.wuyue.rmsystem.controller;

import com.wuyue.rmsystem.model.*;
import com.wuyue.rmsystem.service.Road_Basic_TableService;
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

//regular_date,regular_type
    @RequestMapping(value = "/addRoad", method = RequestMethod.POST)
    public void addRoad(Road_Basic_Table rbt) {
        road_basic_tableService.addRBT(rbt,"常规检查");
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
}
