package com.banyuan.java;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {

        Dog ouou = new Dog("欧欧","吉娃娃");
        Dog feifei = new Dog("菲菲","德牧");
        Dog yaya = new Dog("亚亚","藏獒");
        Dog meimei = new Dog("美美","拉布拉多");

        LinkedList list = new LinkedList();
        list.add(ouou);
        list.add(feifei);
        list.add(yaya);
        list.addFirst(meimei);
      /* Dog dog1 =(Dog)list.getFirst();
        System.out.println(dog1.toString());*/

        list.removeFirst();


        for(int i=0;i<list.size();i++){
            Dog dog = (Dog) list.get(i);
            System.out.println(dog.getName()+" , "+dog.getStrain());
        }


    }


}
