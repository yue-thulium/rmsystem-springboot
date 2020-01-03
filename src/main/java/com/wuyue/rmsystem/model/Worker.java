package com.wuyue.rmsystem.model;

import java.util.Date;

public class Worker {
    private int worker_code;              //职工编号
    private String worker_password;       //密码
    private String name;                  //姓名
    private int age;                      //年龄
    private String sex;                   //性别
    private Date birthday;                //出生年月
    private Date join_date;               //入职日期

    public int getWorker_code() {
        return worker_code;
    }

    public void setWorker_code(int worker_code) {
        this.worker_code = worker_code;
    }

    public String getWorker_password() {
        return worker_password;
    }

    public void setWorker_password(String worker_password) {
        this.worker_password = worker_password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }
}
