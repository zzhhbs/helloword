package com.banyuan.java;

public class Fan implements  Usb {
    @Override
    public void service() {
        System.out.println("风扇开始转了.....");
    }
}
