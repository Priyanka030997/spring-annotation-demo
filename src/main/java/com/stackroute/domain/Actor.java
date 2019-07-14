package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
    @Value("priya")
    private String name;
    @Value("female")
    private String gender;
    @Value("21")
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
