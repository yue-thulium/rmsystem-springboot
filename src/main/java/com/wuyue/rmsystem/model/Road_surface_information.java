package com.wuyue.rmsystem.model;

import java.util.Date;

public class Road_surface_information {
    private int surface_code;                //路面平整度记录编号
    private int regular_code;                //定期检查记录编号
    private String worker_code_name;                  //检查人员姓名
    private int road_code;                   //道路编号
    private String road_name;                //道路名称
    private Date check_date;          //检查日期
    private float IRI;                       //IRI,IRI为国际平整度指数
    private String remark;                  //备注
    private String ifneed;                //需要巡逻
    private int worker_code;

    public int getWorker_code() {
        return worker_code;
    }

    public void setWorker_code(int worker_code) {
        this.worker_code = worker_code;
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

    public int getSurface_code() {
        return surface_code;
    }

    public void setSurface_code(int surface_code) {
        this.surface_code = surface_code;
    }

    public int getRegular_code() {
        return regular_code;
    }

    public void setRegular_code(int regular_code) {
        this.regular_code = regular_code;
    }

    public String getWorker_name() {
        return worker_code_name;
    }

    public void setWorker_name(String worker_name) {
        this.worker_code_name = worker_name;
    }

    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public String getRoad_name() {
        return road_name;
    }

    public void setRoad_name(String road_name) {
        this.road_name = road_name;
    }

    public Date getCheck_date() {
        return check_date;
    }

    public void setCheck_date(Date check_date) {
        this.check_date = check_date;
    }

    public float getIRI() {
        return IRI;
    }

    public void setIRI(float IRI) {
        this.IRI = IRI;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
