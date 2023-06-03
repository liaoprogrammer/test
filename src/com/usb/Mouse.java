package com.usb;

public class Mouse implements USB{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse(String name) {
        this.name = name;
    }
    public void click(){
        System.out.println("点击");
    }
    @Override
    public void connect() {

    }

    @Override
    public void unconnect() {

    }
}
