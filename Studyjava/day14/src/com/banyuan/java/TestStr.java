package com.banyuan.java;

public class TestStr {
    public static void main(String[] args) {

        /*indexOf(int ch) ch 表示的是字符对应的 码值*/
        String str=" abc defajk ";
        System.out.println(str.indexOf(97));
        System.out.println(str.lastIndexOf("b"));
        System.out.println(str.substring(6));
        System.out.println(str.substring(5,7));
        System.out.println(str.trim());




    }
}
