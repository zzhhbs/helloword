package com.banyuan.java;

import java.util.Scanner;

public class TestInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s1=sc.next();
        StringBuffer s2 = new StringBuffer(s1);

        for(int i=s2.length()-3;i>0;i-=3){
            s2.insert(i,",");
        }
        System.out.println(s2);


    }

}
