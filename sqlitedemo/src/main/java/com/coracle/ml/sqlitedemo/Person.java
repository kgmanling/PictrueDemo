package com.coracle.ml.sqlitedemo;

/**
 * 类    名：Person
 * 创 建 者：ML
 * 创建时间：2017/12/2 22:06
 * 更 新 者：${Author}
 * 更新时间：2017/12/2
 * 描   述：${TODO}
 */

public class Person {
    private String name = "zhang san";
    private int age = 12;

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
}
