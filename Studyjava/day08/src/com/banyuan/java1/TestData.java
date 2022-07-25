package com.banyuan.java1;

public class TestData {
    int m=10;
    int n=20;


    public static void main(String[] args) {
        int m=10;
        int n=20;
        System.out.println("m:"+m+",n:"+n);

        TestData d=new TestData();
       /* int temp=d.m;
        d.m=d.n;
        d.n=temp;*/
        TestData.swap(d);
        System.out.println("m:"+d.m+",n:"+d.n);

    }


    public  static void swap(TestData d){

        int temp=d.m;
        d.m=d.n;
        d.n=temp;
    }


}
