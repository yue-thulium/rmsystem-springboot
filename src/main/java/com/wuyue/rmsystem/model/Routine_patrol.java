package com.wuyue.rmsystem.model;

import java.util.Date;

/**
 *设施损害通知单
 * 日常巡查记录 ：
 *  routine_patrol
 * 对应前端js对象：
 * rp: {
 *           patrol_code: '',
 *           road_code: '',
 *           woker_name: '',    //名字非编号
 *           patrol_date: '',
 *           d_type: '',
 *           d_position_description: '',
 *           remark: '',
 *           manage_unite: ''
 *         }
 */
public class Routine_patrol {

    /**
     * 前端传值--String--巡查记录编号
     * 非空值
     */
    private int patrol_code;

    /**
     * 前端传值--String--巡查人员姓名
     * 非空值
     */
    private String woker_code_name;

    /**
     * 前端传值--String--道路编号
     * 非空值
     */
    private int road_code;

    /**
     * 前端传值--Date--巡查日期
     * 非空值
     */
    private Date patrol_date;

    /**
     * 前端传值--String--水泥路损坏类型
     * 可空
     */
    private String d_type;

    /**
     * 前端传值--String--损坏位置及损坏情况描述
     * 可空
     */
    private String d_position_description;

    /**
     * 前端传值--String--备注
     * 可空
     */
    private String remark;

    /**
     * 前端传值--String--管理单位
     * 可空
     */
    private String manage_unite;

    /**
     * 非传递值--int--通过巡查人员姓名查询id
     * 插入表中是需要
     */
    private String woker_code;

    /**
     * 计算上次的巡逻日期
     */
    private Date history;

    public int getPatrol_code() {
        return patrol_code;
    }

    public void setPatrol_code(int patrol_code) {
        this.patrol_code = patrol_code;
    }

    public String getWoker_code() {
        return woker_code;
    }

    public void setWoker_code(String woker_code) {
        this.woker_code = woker_code;
    }

    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public Date getPatrol_date() {
        return patrol_date;
    }

    public void setPatrol_date(Date patrol_date) {
        this.patrol_date = patrol_date;
    }

    public String getD_type() {
        return d_type;
    }

    public void setD_type(String d_type) {
        this.d_type = d_type;
    }

    public String getD_position_description() {
        return d_position_description;
    }

    public void setD_position_description(String d_position_description) {
        this.d_position_description = d_position_description;
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

    public String getWoker_code_name() {
        return woker_code_name;
    }

    public void setWoker_code_name(String woker_code_name) {
        this.woker_code_name = woker_code_name;
    }

    public Date getHistory() {
        return history;
    }

    public void setHistory(Date history) {
        this.history = history;
    }
}
