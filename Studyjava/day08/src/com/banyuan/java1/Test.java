package com.banyuan.java1;

public class Test {



    public static void main(String[] args) {
        int m=10;
        int n=20;
        System.out.println("m:"+m+",n:"+n);

      /*  int temp=m;
        m=n;
        n=temp;*/
       Test.swap(m,n);

        System.out.println("m:"+m+",n:"+n);

    }

    public static   void swap(int m,int n){
        int temp=m;
        m=n;
        n=temp;
    }


}
