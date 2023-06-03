package com.usb;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void installUsb(USB usb){
        if (usb instanceof Keyborad){
            Keyborad key = (Keyborad) usb;
            key.keydown();
        }else {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
    }
}
