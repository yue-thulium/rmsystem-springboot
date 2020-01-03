package com.wuyue.rmsystem.model;

import java.util.Date;

/**
 *设施损害通知单
 * 对用数据库中表 ：
 *  damage_facilities_notice
 * 对应前端js对象：
 * dfn: {
 *           road_code: '',
 *           notice_code: '',
 *           facilities_name: '',
 *           repair_time: '',
 *           damage_position: '',
 *           damage_reason: '',
 *           opinions: '',
 *           technical_person_name: '', //名字非编号
 *           check_person_name: '',  //名字非编号
 *           monitor: '',
 *           notice_date: ''
 *         }
 */
public class Damage_facilities_notice {

    /**
     * 前端传值--String--通知号
     * 非空值
     */
    private int notice_code;

    /**
     * 前端传值--String--设施名称
     * 非空值
     */
    private String facilities_name;

    /**
     *前端传值--String--损坏部位
     * 非空值
     */
    private String damage_position;

    /**
     * 前端传值--String--损坏原因
     * 可空
     */
    private String damage_reason;

    /**
     * 前端传值--String--处理意见
     * 可空
     */
    private String opinions;

    /**
     * 前端传值--Date--整修日期
     * 非空值
     */
    private Date repair_time;

    /**
     *前端传值--通知日期
     * 非空值
     */
    private Date notice_date;

    /**
     * 前端传值--String--班长
     * 非空值
     */
    private String monitor;

    /**
     * 前端传值--String--道路编号
     * 非空值
     */
    private int road_code;

    /**
     *前端传值--String--技术员姓名
     * 非空值
     */
    private String technical_person_name;

    /**
     *前端传值--String--巡视员名字
     * 非空值
     */
    private String check_person_name;

    /**
     * 非传递值--int--通过技术员姓名查询id
     * 插入表中是需要
     */
    private int check_person;

    /**
     * 非传递值--int--通过技术员姓名查询id
     * 插入表中是需要
     */
    private int technical_person;

    public int getNotice_code() {
        return notice_code;
    }

    public void setNotice_code(int notice_code) {
        this.notice_code = notice_code;
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

    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public Date getRepair_time() {
        return repair_time;
    }

    public void setRepair_time(Date repair_time) {
        this.repair_time = repair_time;
    }

    public Date getNotice_date() {
        return notice_date;
    }

    public void setNotice_date(Date notice_date) {
        this.notice_date = notice_date;
    }

    public int getTechnical_person() {
        return technical_person;
    }

    public void setTechnical_person(int technical_person) {
        this.technical_person = technical_person;
    }

    public int getCheck_person() {
        return check_person;
    }

    public void setCheck_person(int check_person) {
        this.check_person = check_person;
    }
}
