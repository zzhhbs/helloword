package com.banyuan.java;

public class Student {

   // private  String sex;
   private  Gender sex;
    public void setSex(Gender sex){
        this.sex=sex;
    }

    public void show(){
        System.out.println("性别是："+sex);
    }



}
