package com.wuyue.rmsystem.model;

import java.util.Date;

public class Asphalt_pavement_damage_information {
    private int asphalt_pavement_code;              //沥青损坏路面编号
    private String worker_code_name;                    //检查人员姓名
    private int damage_code;                        //路面损坏记录编号
    private String d_type;                          //损坏类型
    private float inspect_areas;                     //检查面积
    private float d_areas;                           //损坏面积
    private float d_density;                        //损坏密度
    private float single_point_deduction;           //单项扣分值
    private String remark;                         //备注
    private Date inspect_date;                 //检查日期

    public int getAsphalt_pavement_code() {
        return asphalt_pavement_code;
    }

    public void setAsphalt_pavement_code(int asphalt_pavement_code) {
        this.asphalt_pavement_code = asphalt_pavement_code;
    }

    public String getWorker_code_name_name() {
        return worker_code_name;
    }

    public void setWorker_code_name_name(String worker_code_name) {
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

    public float getInspect_areas() {
        return inspect_areas;
    }

    public void setInspect_areas(float inspect_areas) {
        this.inspect_areas = inspect_areas;
    }

    public float getD_areas() {
        return d_areas;
    }

    public void setD_areas(float d_areas) {
        this.d_areas = d_areas;
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

    public Date getInspect_date() {
        return inspect_date;
    }

    public void setInspect_date(Date inspect_date) {
        this.inspect_date = inspect_date;
    }
}
