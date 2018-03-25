package com.xxzzycq.model;

/**
 * Created by yangchangqi on 2018/3/22.
 */
public class Person {
    private int id;
    private String name;
    private Enum<Sex> sex;
    private String address;
    private String mobile;

    public Person() {}

    public Person(int id, String name, Enum<Sex> sex, String address, String mobile) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<Sex> getSex() {
        return sex;
    }

    public void setSex(Enum<Sex> sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "id = " + id;
    }
}
