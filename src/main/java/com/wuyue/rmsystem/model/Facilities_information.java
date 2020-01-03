package com.wuyue.rmsystem.model;

public class Facilities_information {
    private int facilities_code;         //设施编号
    private int road_code;            //道路编号
    private int inlets_amount;           //雨水口数量
    private int well_amount;             //检查井数量
    private int nameplates_amount;       //路名牌数量
    private int signboards_amount;       //标志牌数量
    private float treepool_area;         //树池面积
    private String other;                //其他

    public int getFacilities_code() {
        return facilities_code;
    }

    public void setFacilities_code(int facilities_code) {
        this.facilities_code = facilities_code;
    }

    public int getRoad_code() {
        return road_code;
    }

    public void setRoad_code(int road_code) {
        this.road_code = road_code;
    }

    public int getInlets_amount() {
        return inlets_amount;
    }

    public void setInlets_amount(int inlets_amount) {
        this.inlets_amount = inlets_amount;
    }

    public int getWell_amount() {
        return well_amount;
    }

    public void setWell_amount(int well_amount) {
        this.well_amount = well_amount;
    }

    public int getNameplates_amount() {
        return nameplates_amount;
    }

    public void setNameplates_amount(int nameplates_amount) {
        this.nameplates_amount = nameplates_amount;
    }

    public int getSignboards_amount() {
        return signboards_amount;
    }

    public void setSignboards_amount(int signboards_amount) {
        this.signboards_amount = signboards_amount;
    }

    public float getTreepool_area() {
        return treepool_area;
    }

    public void setTreepool_area(float treepool_area) {
        this.treepool_area = treepool_area;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
