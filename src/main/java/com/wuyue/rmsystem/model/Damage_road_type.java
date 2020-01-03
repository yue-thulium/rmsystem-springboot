package com.wuyue.rmsystem.model;

public class Damage_road_type {
    private String cement_type;        //损坏类型
    private String d_shape;                 //损坏形状
    private String caculating_method;        //计算方法

    public String getCement_type() {
        return cement_type;
    }

    public void setCement_type(String cement_type) {
        this.cement_type = cement_type;
    }

    public String getD_shape() {
        return d_shape;
    }

    public void setD_shape(String d_shape) {
        this.d_shape = d_shape;
    }

    public String getCaculating_method() {
        return caculating_method;
    }

    public void setCaculating_method(String caculating_method) {
        this.caculating_method = caculating_method;
    }
}
