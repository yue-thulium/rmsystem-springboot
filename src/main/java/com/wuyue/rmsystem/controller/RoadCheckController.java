package com.wuyue.rmsystem.controller;

import com.wuyue.rmsystem.model.*;
import com.wuyue.rmsystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * RoadCheck检测Controller
 * 道路检测
 * path路由说明：
 *  类上标注"/rc" ： 代表道路检测
 *  方法标注格式为 ： "/日常检测（dp）&定期检查（ri）/道路分类（c1r,c2r,c3r）&检测分类（cd,sd）/对应功能"
 */
@RestController
@RequestMapping("/rc")
public class RoadCheckController {

    @Autowired
    Damage_facilities_noticeMapperService damage_facilities_noticeMapperService;
    @Autowired
    Routine_patrolService routine_patrolService;
    @Autowired
    Damage_road_typeService damage_road_typeService;
    @Autowired
    Road_Basic_TableService road_basic_tableService;
    @Autowired
    Road_surface_tableService road_surface_tableService;
    @Autowired
    Road_damage_tableService road_damage_tableService;
    @Autowired
    Asphalt_pavement_tableService asphalt_pavement_tableService;

    /**
     * 对应RoadCheck下一类道路的日常巡查
     * classIRoad
     * 不同路段的分用户所分配的监测路段——一类道路检测
     * 用于当前用户（路段）的一类道路信息获取
     * 当前用于测试
     * @return
     */
    @RequestMapping(value = "/dp/c1r",method = RequestMethod.GET)
    public Map<String, Object> classIRoad() {
        Map<String, Object> map = new HashMap<>();
        List<Road_Basic_Table> list = road_basic_tableService.getRBT("一类");
        List<Damage_road_type> d_type = damage_road_typeService.getDRT();
        map.put("d_type",d_type);
        map.put("tableData",this.formatRoadInf(list,0));
        return map;
    }

    /**
     * 对应RoadCheck下二类道路的日常巡查
     * classIRoad
     * 不同路段的分用户所分配的监测路段——一类道路检测
     * 用于当前用户（路段）的一类道路信息获取
     * 当前用于测试
     * @return
     */
    @RequestMapping(value = "/dp/c2r",method = RequestMethod.GET)
    public Map<String, Object> classIIRoad() {
        Map<String, Object> map = new HashMap<>();
        List<Road_Basic_Table> list = road_basic_tableService.getRBT("二类");
        List<Damage_road_type> d_type = damage_road_typeService.getDRT();
        map.put("d_type",d_type);
        map.put("tableData",this.formatRoadInf(list,1));
        return map;
    }

    /**
     * 对应RoadCheck下三类道路的日常巡查
     * classIRoad
     * 不同路段的分用户所分配的监测路段——一类道路检测
     * 用于当前用户（路段）的一类道路信息获取
     * 当前用于测试
     * @return
     */
    @RequestMapping(value = "/dp/c3r",method = RequestMethod.GET)
    public Map<String, Object> classIIIRoad() {
        Map<String, Object> map = new HashMap<>();
        List<Road_Basic_Table> list = road_basic_tableService.getRBT("三类");
        List<Damage_road_type> d_type = damage_road_typeService.getDRT();
        map.put("d_type",d_type);
        map.put("tableData",this.formatRoadInf(list,2));
        return map;
    }

    /**
     * 对应RoadCheck下添加日常巡查（一、二、三类道路通用）
     * classIRoad、classIIRoad、classIIIRoad
     * 道路预警添加
     * 前端传值格式见实体类备注
     * @param dfn
     */
    @RequestMapping(value = "/dp/cr/addDFN",method = RequestMethod.POST)
    public int addFDN(Damage_facilities_notice dfn){
        Road_Basic_Table r = null;
        r = new Road_Basic_Table();
        r.setRoad_state("预警中");
        r.setRoad_code(dfn.getRoad_code());
        road_basic_tableService.changeState(r);
        damage_facilities_noticeMapperService.addDFN(dfn);
        road_basic_tableService.addDFN(dfn.getRoad_code());
        return 0;
    }

    /**
     * 解除道路预警（一、二、三类道路通用）
     * @param id
     * @return
     */
    @RequestMapping(value = "/dp/cr/deleteDFN",method = RequestMethod.POST)
    public int deleteDFN(int id){
        Road_Basic_Table r = new Road_Basic_Table();
        r.setRoad_state("正常");
        r.setRoad_code(id);
        road_basic_tableService.changeState(r);
        road_basic_tableService.deleteDFN(id);
        return 0;
    }

    /**
     * 对应RoadCheck下日常巡查（一、二、三类道路通用）
     * classIRoad、classIIRoad、classIIIRoad
     * 日常巡逻
     * 前端传值格式见实体类备注
     * @param rp
     */
    @RequestMapping(value = "/dp/cr/addPR",method = RequestMethod.POST)
    public void addPR(Routine_patrol rp){
        Road_Basic_Table r = null;
        if ("无".equals(rp.getD_type())) {
            routine_patrolService.addRP(rp);
        } else {
            r = new Road_Basic_Table();
            r.setRoad_code(rp.getRoad_code());
            r.setRoad_state("一般");
            road_basic_tableService.changeState(r);
            routine_patrolService.addRP(rp);
        }
    }

    /**
     * 对应RoadCheck下定期检查
     * conventionalDetection
     * 不同路段的分用户所分配的监测路段——常规检测
     * 用于当前用户（路段）的常规检测道路信息获取
     * 预留方法
     * @return
     */
    @RequestMapping(value = "/ri/cd",method = RequestMethod.GET)
    public Map<String, Object> conventionalDetection() {
        Map<String, Object> map = new HashMap<>();
        List<Road_surface_information> road_surface_informations=road_surface_tableService.getRST();
        map.put("tabledate",this.formatRoadRegularInf(road_surface_informations,1));
        return map;
    }

    /**对应RoadCheck下定期检查
     * structDetection
     * 不同路段的分用户所分配的监测路段——结构强度检测
     * 用于当前用户（路段）的结构强度检测道路信息获取
     * 预留方法
     * @return
     */
    @RequestMapping(value = "/ri/sd",method = RequestMethod.GET)
    public Map<String, Object> structDetection() {
        Map<String, Object> map = new HashMap<>();
        return map;
    }
    /**
     * 对应RoadCheck下定期巡查（常规检查）
     * classIRoad、classIIRoad、classIIIRoad
     * 日常巡逻
     * 前端传值格式见实体类备注
     * @param rsi
     */
    @RequestMapping(value = "/dp/cr/updateRST",method = RequestMethod.POST)
    public void updateRST(Road_surface_information rsi){
       road_surface_tableService.updateRST(rsi);
    }

    /**对应RoadCheck下定期检查
     * 道路设施路面损害情况记录表
     *
     * 用于当前用户（路段）的道路检测道路信息获取
     * 预留方法
     * @return
     */
    @RequestMapping(value = "/ri/rdt",method = RequestMethod.GET)
    public Map<String, Object> getRoad_damage_information() {
        Map<String, Object> map = new HashMap<>();
        List<Road_damage_information> road_damage_informations=road_damage_tableService.getRDT();
        map.put("tabledata",this.formatRoadDamageInf(road_damage_informations,1));
        return map;
    }
    @RequestMapping(value = "/ri/updateRDT",method = RequestMethod.POST)
    public void updateRDT(Road_damage_information rdt) {
        road_damage_tableService.updateRDT(rdt);
        asphalt_pavement_tableService.addAPT(EditData_APT(rdt));
    }

    @RequestMapping(value = "/rm/route",method = RequestMethod.GET)
    public Map<String,Object> getRoute() {
        Map<String, Object> map = new HashMap<>();
        List<Routine_patrol> list = routine_patrolService.getRP();
        map.put("tabledata",list);
        return map;
    }

    /**
     * 道路信息处理
     * @param list
     * @return
     */
    private List<Road_Basic_Table> formatRoadInf(List<Road_Basic_Table> list,int i) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        Date history = null;
        for (Road_Basic_Table r: list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_YEAR,-i);
            history = calendar.getTime();

            List<Routine_patrol> routine_patrols=routine_patrolService.getRPbyRoad(r.getRoad_code(),formatter.format(history),formatter.format(date));
            if (routine_patrols.size()>0){
                r.setIfneed("否");
                r.setAddPr(true);
            } else {
                r.setIfneed("是");
                r.setAddPr(false);
            }
        }
        return list;
    }
    /**
     * 道路定期检查信息处理
     * @param list
     * @return
     */
    private List<Road_surface_information> formatRoadRegularInf(List<Road_surface_information> list,int i) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        Date history = null;
        for (Road_surface_information r: list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.YEAR,-i);
            history = calendar.getTime();

            List<Road_surface_information> regular_inspection_informations=road_surface_tableService.getRPbyRoad(r.getRoad_name(),formatter.format(history),formatter.format(date));
            if (regular_inspection_informations.size()>0){
                r.setIfneed("否");
                r.setAddPr(true);
            } else {
                r.setIfneed("是");
                r.setAddPr(false);
            }
        }
        return list;
    }
    /**
     * 道路损害信息处理
     * @param list
     * @return
     */
    private List<Road_damage_information> formatRoadDamageInf(List<Road_damage_information> list,int i) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        Date history = null;
        for (Road_damage_information r: list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.YEAR,-i);
            history = calendar.getTime();

            List<Road_damage_information> regular_inspection_informations=road_damage_tableService.getRPbyRoad(r.getRoad_name(),formatter.format(history),formatter.format(date));
            if (regular_inspection_informations.size()>0){
                r.setIfneed("否");
                r.setAddPr(true);
            } else {
                r.setIfneed("是");
                r.setAddPr(false);
            }
        }
        return list;
    }
    /**
     *
     * 沥青路面在道路损坏调查之后更新
     * 需要对数据进行一些处理
     */
    private Asphalt_pavement_damage_information EditData_APT(Road_damage_information rdi){

        float D_density=0;
        Asphalt_pavement_damage_information apdi=new Asphalt_pavement_damage_information();
        apdi.setAsphalt_pavement_code(rdi.getDamage_code()+1);
        apdi.setDamage_code(rdi.getDamage_code());
        apdi.setWorker_code_name_name(rdi.getWorker_code_name());
        apdi.setInspect_areas(rdi.getLength()*rdi.getWidth());
        apdi.setD_type(rdi.getDamage_type());
        apdi.setD_areas(rdi.getD_areas());
        apdi.setD_density((rdi.getD_areas()*100)/(rdi.getLength()*rdi.getWidth()));

        if(apdi.getD_density()<=0.01)
            D_density=(float) 0.01;
        else if(apdi.getD_density()<=0.1)
            D_density=(float) 0.1;
        else if (apdi.getD_density()<=1)
            D_density=1;
        else if (apdi.getD_density()<=10)
            D_density=10;
        else if (apdi.getD_density()<=50)
            D_density=50;
        else if (apdi.getD_density()<=100)
            D_density=100;
        rdi.setD_density(D_density);
        apdi.setSingle_point_deduction(road_damage_tableService.getSingle_point_deduction(rdi));

        apdi.setRemark(rdi.getRemark());
        apdi.setInspect_date(rdi.getMake_date());

        return apdi;
    }
}
