package com.wuyue.rmsystem.model;

import java.util.Date;

public class Roadway_Information {
    private int car_code;                   //车行道编号
    private int road_code;                  //道路编号
    private String pavement_type;               //路面类型
    private float pavement_thickness;      //路面厚度
    private String grassroots_type;        //基层类型
    private float grassroots_thickness;          //基层厚度
    private int lanes;           //车道数
    private String direction;   //通行方向
    private String motorway_width_range;   //机动车道宽度范围,原来是float
    private String r_m_w_r;              //右侧非机动车道宽度范围
    private String l_m_w_r;              //左侧非机动车道宽度范围
    private float lane_areas;            //车行道面积
    private String lateral_rock_type;      //侧石类型
    private float lateral_rock_length;       //侧石长度
    private String flat_rock_type;        //平石类型

    public int getCar_code() {
        return car_code;
    }
    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public void setCar_code(int car_code) {
        this.car_code = car_code;
    }

    public String getPavement_type() {
        return pavement_type;
    }

    public void setPavement_type(String pavement_type) {
        this.pavement_type = pavement_type;
    }

    public float getPavement_thickness() {
        return pavement_thickness;
    }

    public void setPavement_thickness(float pavement_thickness) {
        this.pavement_thickness = pavement_thickness;
    }

    public String getGrassroots_type() {
        return grassroots_type;
    }

    public void setGrassroots_type(String grassroots_type) {
        this.grassroots_type = grassroots_type;
    }

    public float getGrassroots_thickness() {
        return grassroots_thickness;
    }

    public void setGrassroots_thickness(float grassroots_thickness) {
        this.grassroots_thickness = grassroots_thickness;
    }

    public int getLanes() {
        return lanes;
    }

    public void setLanes(int lanes) {
        this.lanes = lanes;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMotorway_width_range() {
        return motorway_width_range;
    }

    public void setMotorway_width_range(String motorway_width_range) {
        this.motorway_width_range = motorway_width_range;
    }

    public String getR_m_w_r() {
        return r_m_w_r;
    }

    public void setR_m_w_r(String r_m_w_r) {
        this.r_m_w_r = r_m_w_r;
    }

    public String getL_m_w_r() {
        return l_m_w_r;
    }

    public void setL_m_w_r(String l_m_w_r) {
        this.l_m_w_r = l_m_w_r;
    }

    public float getLane_areas() {
        return lane_areas;
    }

    public void setLane_areas(float lane_areas) {
        this.lane_areas = lane_areas;
    }

    public String getLateral_rock_type() {
        return lateral_rock_type;
    }

    public void setLateral_rock_type(String lateral_rock_type) {
        this.lateral_rock_type = lateral_rock_type;
    }

    public float getLateral_rock_length() {
        return lateral_rock_length;
    }

    public void setLateral_rock_length(float lateral_rock_length) {
        this.lateral_rock_length = lateral_rock_length;
    }

    public String getFlat_rock_type() {
        return flat_rock_type;
    }

    public void setFlat_rock_type(String flat_rock_type) {
        this.flat_rock_type = flat_rock_type;
    }

    public float getFlat_rock_length() {
        return flat_rock_length;
    }

    public void setFlat_rock_length(float flat_rock_length) {
        this.flat_rock_length = flat_rock_length;
    }

    private float flat_rock_length;       //平石长度
}
