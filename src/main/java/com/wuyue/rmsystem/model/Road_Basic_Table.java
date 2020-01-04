package com.wuyue.rmsystem.model;

import java.util.Date;

public class Road_Basic_Table {
    private int road_code;              //道路编号
    private String road_name;           //道路名称
    private String road_trend;          //道路走向
    private String username;            //片区账号
    private String road_begin;          //起点
    private String road_end;            //终点
    private String design_unite;         //设计单位
    private String construction_unite;   //施工单位
    private String road_class;          //道路等级(总和评价指数PQI)

    private String ifneed;                //需要巡逻
    private boolean addPr;                //巡逻按钮是否可用标志位
    private String road_state;            //道路状态

    private String pavement_class;      //路面等级(路面行使质量指数RQI=4.98-0.34*IRI,IRI为国际平整度指数)
    private String yanghu_class;        //养护等级
    private String road_width_range;    //路幅宽度范围
    private float road_length;          //道路长度
    private float road_area;            //道路面积
    private float aadt;                 //aadt，道路断面的年平均日交通量
    private String traffic_class;       //交通量等级
    private String town;            //所属乡镇
    private String manage_sort;      //管理分类
    private String manage_unite;      //管理单位
    private String maintenance_unite;     //养护单位
    private Date build_date;             //建造年月
    private String table_unite;      //制表单位
    private String auditor;              //审核人
    private String table_maker;           //制表人
    private Date table_make_time;        //制表日期
    private Boolean road_prevent;         //道路预警

    public int getRoad_code() {
        return road_code;
    }

    public String getRoad_name() {
        return road_name;
    }

    public String getRoad_trend() {
        return road_trend;
    }

    public String getUsername() {
        return username;
    }

    public String getRoad_begin() {
        return road_begin;
    }

    public String getRoad_end() {
        return road_end;
    }

    public String getDesign_unite() {
        return design_unite;
    }

    public String getConstruction_unite() {
        return construction_unite;
    }

    public String getRoad_class() {
        return road_class;
    }

    public String getIfneed() {
        return ifneed;
    }

    public boolean isAddPr() {
        return addPr;
    }

    public String getRoad_state() {
        return road_state;
    }

    public String getPavement_class() {
        return pavement_class;
    }

    public String getYanghu_class() {
        return yanghu_class;
    }

    public String getRoad_width_range() {
        return road_width_range;
    }

    public float getRoad_length() {
        return road_length;
    }

    public float getRoad_area() {
        return road_area;
    }

    public float aadAadt() {
        return aadt;
    }

    public String getTraffic_class() {
        return traffic_class;
    }

    public String getTown() {
        return town;
    }

    public String getManage_sort() {
        return manage_sort;
    }

    public String getManage_unite() {
        return manage_unite;
    }

    public String getMaintenance_unite() {
        return maintenance_unite;
    }

    public Date getBuild_date() {
        return build_date;
    }

    public String getTable_unite() {
        return table_unite;
    }

    public String getAuditor() {
        return auditor;
    }

    public String getTable_maker() {
        return table_maker;
    }

    public Date getTable_make_time() {
        return table_make_time;
    }

    public Boolean getRoad_prevent() {
        return road_prevent;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public void setRoad_trend(String road_trend) {
        this.road_trend = road_trend;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRoad_begin(String road_begin) {
        this.road_begin = road_begin;
    }

    public void setRoad_end(String road_end) {
        this.road_end = road_end;
    }

    public void setDesign_unite(String design_unite) {
        this.design_unite = design_unite;
    }

    public void setConstruction_unite(String construction_unite) {
        this.construction_unite = construction_unite;
    }

    public void setRoad_class(String road_class) {
        this.road_class = road_class;
    }

    public void setIfneed(String ifneed) {
        this.ifneed = ifneed;
    }

    public void setAddPr(boolean addPr) {
        this.addPr = addPr;
    }

    public void setRoad_state(String road_state) {
        this.road_state = road_state;
    }

    public void setPavement_class(String pavement_class) {
        this.pavement_class = pavement_class;
    }

    public void setYanghu_class(String yanghu_class) {
        this.yanghu_class = yanghu_class;
    }

    public void setRoad_width_range(String road_width_range) {
        this.road_width_range = road_width_range;
    }

    public void setRoad_length(float road_length) {
        this.road_length = road_length;
    }

    public void setRoad_area(float road_area) {
        this.road_area = road_area;
    }

    public void setAadt(float aadt) {
        this.aadt = aadt;
    }

    public float getAadt() {
        return aadt;
    }

    public void setTraffic_class(String traffic_class) {
        this.traffic_class = traffic_class;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setManage_sort(String manage_sort) {
        this.manage_sort = manage_sort;
    }

    public void setManage_unite(String manage_unite) {
        this.manage_unite = manage_unite;
    }

    public void setMaintenance_unite(String maintenance_unite) {
        this.maintenance_unite = maintenance_unite;
    }

    public void setBuild_date(Date build_date) {
        this.build_date = build_date;
    }

    public void setTable_unite(String table_unite) {
        this.table_unite = table_unite;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public void setTable_maker(String table_maker) {
        this.table_maker = table_maker;
    }

    public void setTable_make_time(Date table_make_time) {
        this.table_make_time = table_make_time;
    }

    public void setRoad_prevent(Boolean road_prevent) {
        this.road_prevent = road_prevent;
    }
}
