package com.wuyue.rmsystem.model;

import java.util.Date;

public class Road_damage_information {
    private int damage_code;              //路面损坏记录编号
    private String worker_code_name;            //检查人员姓名
    private String road_name;                //道路编号
    private int regular_code;             //定期检查记录编号
    private String begin_end;                 //起止位置
    private float length;           //长度
    private float width;            //检查总宽
    private String damage_type;           //损坏类型
    private float d_lenth;               //损坏长
    private float d_width;                //损坏宽
    private float d_height;               //损坏高
    private String d_position_description;           //损坏位置及情况描述
    private float d_areas;                 //损坏面积
    private String remark;               //备注
    private String manage_unite;               //管理单位
    private Date make_date;              //制表日期
    private String ifneed;                //需要巡逻
    private float d_density;              //损坏密度

    public float getD_density() {
        return d_density;
    }

    public void setD_density(float d_density) {
        this.d_density = d_density;
    }

    public String getWorker_code_name() {
        return worker_code_name;
    }

    public void setWorker_code_name(String worker_code_name) {
        this.worker_code_name = worker_code_name;
    }

    public String getIfneed() {
        return ifneed;
    }

    public void setIfneed(String ifneed) {
        this.ifneed = ifneed;
    }

    public boolean isAddPr() {
        return addPr;
    }

    public void setAddPr(boolean addPr) {
        this.addPr = addPr;
    }

    private boolean addPr;                //巡逻按钮是否可用标志位

    public int getDamage_code() {
        return damage_code;
    }

    public void setDamage_code(int damage_code) {
        this.damage_code = damage_code;
    }

    public String getWorker_name() {
        return worker_code_name;
    }

    public void setWorker_name(String worker_name) {
        this.worker_code_name = worker_name;
    }

    public int getRegular_code() {
        return regular_code;
    }

    public void setRegular_code(int regular_code) {
        this.regular_code = regular_code;
    }

    public String getBegin_end() {
        return begin_end;
    }

    public void setBegin_end(String begin_end) {
        this.begin_end = begin_end;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getDamage_type() {
        return damage_type;
    }

    public void setDamage_type(String damage_type) {
        this.damage_type = damage_type;
    }

    public float getD_lenth() {
        return d_lenth;
    }

    public void setD_lenth(float d_lenth) {
        this.d_lenth = d_lenth;
    }

    public float getD_width() {
        return d_width;
    }

    public void setD_width(float d_width) {
        this.d_width = d_width;
    }

    public float getD_height() {
        return d_height;
    }

    public void setD_height(float d_height) {
        this.d_height = d_height;
    }

    public String getD_position_description() {
        return d_position_description;
    }

    public void setD_position_description(String d_position_description) {
        this.d_position_description = d_position_description;
    }

    public float getD_areas() {
        return d_areas;
    }

    public void setD_areas(float d_areas) {
        this.d_areas = d_areas;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getManage_unite() {
        return manage_unite;
    }

    public void setManage_unite(String manage_unite) {
        this.manage_unite = manage_unite;
    }

    public Date getMake_date() {
        return make_date;
    }

    public void setMake_date(Date make_date) {
        this.make_date = make_date;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }
}
