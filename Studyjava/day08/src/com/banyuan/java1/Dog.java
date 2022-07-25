package com.banyuan.java1;

public class Dog {
    String name;
    int health=100;
    int love;
    String stain;

    public void show(){
        System.out.println("宠物的自白");
        System.out.println("我的名字叫："+name+",健康值是："+health+
                ",和主人的亲密度是："+love+",品种是："+stain);
    }
}
