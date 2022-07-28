package com.banyuan.java;

public class Disk implements  Usb {
    @Override
    public void service() {
        System.out.println("硬盘开始传输数据了。。。。");
    }
}
