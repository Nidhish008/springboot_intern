package com.example.springboot_demo.model;

public class Employee {
    private int userid;
    private String name;
    private String job;

    // Parameterized constructor
    public Employee(int userid, String name, String job) {
        this.userid = userid;
        this.name = name;
        this.job = job;
    }

    // Getters and Setters
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}