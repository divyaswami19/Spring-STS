package com.example.rest_demo.model;

public class Student {
    private String stdId;
    private String stdName;
    private String stdAdd;

    public Student()
    {
        
    }

    public Student(String stdId, String stdName ,String stdAdd ) {
       
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdAdd = stdAdd;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdAdd() {
        return stdAdd;
    }

    public void setStdAdd(String stdAdd) {
        this.stdAdd = stdAdd;
    }

}