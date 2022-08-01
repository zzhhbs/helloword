package com.banyuan.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestDog {
    public static void main(String[] args) {

        Dog ouou = new Dog("欧欧","吉娃娃");
        Dog feifei = new Dog("菲菲","德牧");
        Dog yaya = new Dog("亚亚","藏獒");
        Dog meimei = new Dog("美美","拉布拉多");

        List list = new ArrayList<>();
        /*add（Object） 增加 对象*/
        list.add(ouou);
        list.add(feifei);
        list.add(yaya);

        /*size() 查看长度*/

        System.out.println(list.size());


        list.add(0,meimei);  //在指定下标 增加对象

        list.remove(meimei);
        boolean contains = list.contains(meimei);
        System.out.println("包含么？"+contains);


        //Dog dog = new Dog();
        /*get(i) 获取指定下标内容*/
        for(int i=0;i<list.size();i++){
            Dog dog = (Dog) list.get(i);
            System.out.println(dog.getName()+" , "+dog.getStrain());
        }








    }
}
