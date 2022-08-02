package com.banyuan.java;

import jdk.swing.interop.SwingInterOpUtils;

public class TestString {
    public static void main(String[] args) {


        String str1="bdqn";
        String str2="bdqn";
        System.out.println(str1==str2);   // T
        System.out.println(str1.equals(str2));   //T

        System.out.println("======");

        String str3=new String("bdqn");
        System.out.println(str1==str3); //F
        System.out.println(str1.equals(str3));  // T

        System.out.println("=========");

        String str4=new String("bdqn");
        System.out.println(str4==str3);     //f
        System.out.println(str4.equals(str3));   //  T


        System.out.println("============");

        String str="abcdefg";
        String str5="ABCDEFGw";
        System.out.println(str.length());

        System.out.println("转换成大写："+str.toUpperCase());
        System.out.println("转换成小写："+str5.toLowerCase());
        System.out.println("忽略大小写比较值是否相等："+str.equalsIgnoreCase(str5));


    }
}
