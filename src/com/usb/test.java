package com.usb;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer("拯救者");
        USB u = new Mouse("雷神");
        computer.installUsb(u);
    }
}
