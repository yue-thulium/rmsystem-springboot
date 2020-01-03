package com.wuyue.rmsystem.model;

public class Facilities_damage_information {
    private int notice_code;              //通知号
    private int road_code;                //道路编号
    private String facilities_name;                    //设施名称
    private String damage_position;                  //损坏部位
    private String damage_reason;                 //损坏原因
    private String opinions;                      //处理意见
    private String repair_date;                   //整修日期
    private String notice_date;                   //通知日期
    private String monitor;                       //班长
    private String technical_person_name;         //技术人员编号
    private String check_person_name;            //巡查人员编号

    public int getNotice_code() {
        return notice_code;
    }

    public void setNotice_code(int notice_code) {
        this.notice_code = notice_code;
    }

    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public String getFacilities_name() {
        return facilities_name;
    }

    public void setFacilities_name(String facilities_name) {
        this.facilities_name = facilities_name;
    }

    public String getDamage_position() {
        return damage_position;
    }

    public void setDamage_position(String damage_position) {
        this.damage_position = damage_position;
    }

    public String getDamage_reason() {
        return damage_reason;
    }

    public void setDamage_reason(String damage_reason) {
        this.damage_reason = damage_reason;
    }

    public String getOpinions() {
        return opinions;
    }

    public void setOpinions(String opinions) {
        this.opinions = opinions;
    }

    public String getRepair_date() {
        return repair_date;
    }

    public void setRepair_date(String repair_date) {
        this.repair_date = repair_date;
    }

    public String getNotice_date() {
        return notice_date;
    }

    public void setNotice_date(String notice_date) {
        this.notice_date = notice_date;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTechnical_person_name() {
        return technical_person_name;
    }

    public void setTechnical_person_name(String technical_person_name) {
        this.technical_person_name = technical_person_name;
    }

    public String getCheck_person_name() {
        return check_person_name;
    }

    public void setCheck_person_name(String check_person_name) {
        this.check_person_name = check_person_name;
    }
}
