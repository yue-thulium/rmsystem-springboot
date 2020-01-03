package com.wuyue.rmsystem.model;

import java.util.Date;

public class CementRoad_pavement_damage_information {
    private int cement_road_code;              //水泥路面损坏表编号
    private String worker_code_name;            //调查人员姓名
    private int damage_code;                      //损坏记录编号
    private String d_type;                           //损坏类型
    private float inspect_arears;                      //检查面积
    private float damage_areas;                            //损坏面积
    private float d_density;                         //损坏密度
    private float single_point_deduction;            //单项扣分值
    private String remark;                          //备注
    private Date check_date;                  //检查日期

    public int getCement_road_code() {
        return cement_road_code;
    }

    public void setCement_road_code(int cement_road_code) {
        this.cement_road_code = cement_road_code;
    }

    public String getWorker_code_name() {
        return worker_code_name;
    }

    public void setWorker_code_name(String worker_code_name) {
        this.worker_code_name = worker_code_name;
    }

    public int getDamage_code() {
        return damage_code;
    }

    public void setDamage_code(int damage_code) {
        this.damage_code = damage_code;
    }

    public String getD_type() {
        return d_type;
    }

    public void setD_type(String d_type) {
        this.d_type = d_type;
    }

    public float getInspect_arears() {
        return inspect_arears;
    }

    public void setInspect_arears(float inspect_arears) {
        this.inspect_arears = inspect_arears;
    }

    public float getDamage_areas() {
        return damage_areas;
    }

    public void setDamage_areas(float damage_areas) {
        this.damage_areas = damage_areas;
    }

    public float getD_density() {
        return d_density;
    }

    public void setD_density(float d_density) {
        this.d_density = d_density;
    }

    public float getSingle_point_deduction() {
        return single_point_deduction;
    }

    public void setSingle_point_deduction(float single_point_deduction) {
        this.single_point_deduction = single_point_deduction;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCheck_date() {
        return check_date;
    }

    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
    }
}
