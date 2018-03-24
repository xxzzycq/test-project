package com.xxzzycq.model;

/**
 * Created by yangchangqi on 2018/3/24.
 */
public class Student {
    private long num;
    private String name;
    private Sex sex;
    private int age;
    private String grade;

    public Student(long num, String name, Sex sex, int age, String grade) {
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
