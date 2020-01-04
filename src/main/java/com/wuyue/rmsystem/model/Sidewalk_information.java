package com.wuyue.rmsystem.model;

public class Sidewalk_information {
    private int sidewalk_code;                   //人行道编号
    private int road_code;                  //道路编号
    private String direction;            //方位
    private String pavement_type;                //铺面类型
    private float sidewalk_length;             //长度
    private String sidewalk_width_range;               //宽度范围
    private float sidewalk_areas;          //直线面积
    private float intersection_areas;     //交叉口面积
    private float blind_length;     //盲道长度
    private float accessibility_areas;                //无障碍通道面积
    private float greenbelt_areas;                //绿化带面积
    private String Roadway_area;            //侧石类型
    private String Lateral_rock_type;       //平石类型

    public int getSidewalk_code() {
        return sidewalk_code;
    }

    public void setSidewalk_code(int sidewalk_code) {
        this.sidewalk_code = sidewalk_code;
    }

    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPavement_type() {
        return pavement_type;
    }

    public void setPavement_type(String pavement_type) {
        this.pavement_type = pavement_type;
    }

    public float getSidewalk_length() {
        return sidewalk_length;
    }

    public void setSidewalk_length(float sidewalk_length) {
        this.sidewalk_length = sidewalk_length;
    }

    public String getSidewalk_width_range() {
        return sidewalk_width_range;
    }

    public void setSidewalk_width_range(String sidewalk_width_range) {
        this.sidewalk_width_range = sidewalk_width_range;
    }

    public float getSidewalk_areas() {
        return sidewalk_areas;
    }

    public void setSidewalk_areas(float sidewalk_areas) {
        this.sidewalk_areas = sidewalk_areas;
    }

    public float getIntersection_areas() {
        return intersection_areas;
    }

    public void setIntersection_areas(float intersection_areas) {
        this.intersection_areas = intersection_areas;
    }

    public float getBlind_length() {
        return blind_length;
    }

    public void setBlind_length(float blind_length) {
        this.blind_length = blind_length;
    }

    public float getAccessibility_areas() {
        return accessibility_areas;
    }

    public void setAccessibility_areas(float accessibility_areas) {
        this.accessibility_areas = accessibility_areas;
    }

    public float getGreenbelt_areas() {
        return greenbelt_areas;
    }

    public void setGreenbelt_areas(float greenbelt_areas) {
        this.greenbelt_areas = greenbelt_areas;
    }

    public String getRoadway_area() {
        return Roadway_area;
    }

    public void setRoadway_area(String roadway_area) {
        Roadway_area = roadway_area;
    }

    public String getLateral_rock_type() {
        return Lateral_rock_type;
    }

    public void setLateral_rock_type(String lateral_rock_type) {
        Lateral_rock_type = lateral_rock_type;
    }
}
