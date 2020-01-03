package com.wuyue.rmsystem.model;

public class Divider_band_information {
    private int divider_code;          //分隔带编号
    private int road_code;           //道路编号
    private String divider_type;       //分隔带类型
    private float length;     //长度
    private float width;           //高度
    private float height;            //宽度
    private float areas;             //面积

    public int getDivider_code() {
        return divider_code;
    }

    public void setDivider_code(int divider_code) {
        this.divider_code = divider_code;
    }

    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public String getDivider_type() {
        return divider_type;
    }

    public void setDivider_type(String divider_type) {
        this.divider_type = divider_type;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getAreas() {
        return areas;
    }

    public void setAreas(float areas) {
        this.areas = areas;
    }
}
