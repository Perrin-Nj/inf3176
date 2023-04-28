package com.uy1.inf3176.model;


public class Student {
    private String name;
    private String regNumber;
    private String level;

    public Student(String name, String regNumber, String level) {
        this.name = name;
        this.regNumber = regNumber;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
