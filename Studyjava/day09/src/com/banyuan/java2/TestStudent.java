package com.banyuan.java2;

public class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student(1001,"唐僧");
        Student s2 = new Student(1001,"唐僧");
        System.out.println(s1.equals(s2));
    }


}
