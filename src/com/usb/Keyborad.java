package com.usb;

public class Keyborad implements USB{
    public Keyborad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;
    public void keydown(){
        System.out.println("敲击萨比");
    }
    @Override
    public void connect() {

    }

    @Override
    public void unconnect() {

    }
}
