package com.wuyue.rmsystem.model;

import java.util.Date;

public class Regular_inspection_information {
    private int regular_code;               //定期检查记录编号
    private Date regular_date;         //检查日期
    private String regular_type;                    //检查类型
    private String remark;                 //备注

    public int getRegular_code() {
        return regular_code;
    }

    public void setRegular_code(int regular_code) {
        this.regular_code = regular_code;
    }

    public Date getRegular_date() {
        return regular_date;
    }

    public void setRegular_date(Date regular_date) {
        this.regular_date = regular_date;
    }

    public String getRegular_type() {
        return regular_type;
    }

    public void setRegular_type(String regular_type) {
        this.regular_type = regular_type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
