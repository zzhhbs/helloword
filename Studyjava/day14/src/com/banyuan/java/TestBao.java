package com.banyuan.java;


/*
*   包装类和对应的基本数据类型的转换
*   valueOf() : 将基本数据类型转换为对应的包装类
*   xxValue()  xx表示的是某个基本数据类型  ，如果转换成int的基本类型就是  intValue()  floatValue();
*   Character  里面是不可以传入String 类型作为参数的，  其他的包装类都是可以的。
*
*
* */


public class TestBao {
    public static void main(String[] args) {
        Byte b =new Byte((byte) 12);


        int n=12;
        Integer i=new Integer(n);
        Integer i2 = Integer.valueOf(n);
        Character c=Character.valueOf('a');
        int i1 = i2.intValue();

        /*装箱*/
        Integer m1=20;
        //拆箱
        int m2=m1;


        System.out.println(i2+" "+i1);


    }
}
