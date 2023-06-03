package com.api;

public class student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public student(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "name:"+name;
    }
}
