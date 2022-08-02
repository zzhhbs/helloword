package com.banyuan.java;

public class TestBuffer {
    public static void main(String[] args) {

        String s="abc";
        StringBuffer s2 =new StringBuffer(s);
        StringBuffer append = s2.append("**");
        System.out.println(append);
        StringBuffer insert = s2.insert(1, "*");
        System.out.println(insert);
    }
}
