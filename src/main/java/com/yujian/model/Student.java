package com.yujian.model;


import java.util.Date;

/**
 * 这个模型对相应的是Student
 */
public class Student {
    private int stuId;
    private String stuName;
    private int stuSex;
    private Date birth;

    private ClassInfo classInfo;

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuSex() {
        return stuSex;
    }

    public void setStuSex(int stuSex) {
        this.stuSex = stuSex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
