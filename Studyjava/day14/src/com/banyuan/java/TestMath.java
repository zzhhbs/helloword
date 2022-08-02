package com.banyuan.java;

import java.util.Random;

public class TestMath {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 10);
        System.out.println(random);

        Random random1 = new Random();
        for(int i=0;i<20;i++){
            int i1 = random1.nextInt(10);
            System.out.println((i+1)+":"+i1);
        }

    }

}
