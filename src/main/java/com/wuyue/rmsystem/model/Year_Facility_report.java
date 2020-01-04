package com.wuyue.rmsystem.model;

import java.util.Date;

public class Year_Facility_report {
    private Date check_date;          //检查日期
    private String road_name;              //道路编号
    private float evaluation_index;          //综合评价指数
    private float planeness;                 //平整度
    private String damage_condition;       //破损状况

    public Date getCheck_date() {
        return check_date;
    }

    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public float getEvaluation_index() {
        return evaluation_index;
    }

    public void setEvaluation_index(float evaluation_index) {
        this.evaluation_index = evaluation_index;
    }

    public float getPlaneness() {
        return planeness;
    }

    public void setPlaneness(float planeness) {
        this.planeness = planeness;
    }

    public String getDamage_condition() {
        return damage_condition;
    }

    public void setDamage_condition(String damage_condition) {
        this.damage_condition = damage_condition;
    }
}
