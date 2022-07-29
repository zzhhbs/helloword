package com.banyuan.java1;

public class TestMethod {

    public void m2() {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public  void m1() throws  Exception{


        System.out.println("1111");
    }



}
