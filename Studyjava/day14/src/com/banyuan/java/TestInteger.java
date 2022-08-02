package com.banyuan.java;

import java.util.ArrayList;
import java.util.List;


/*
*   包装类：每一个基本数据类型都有一个对应的包装类
*       作用：可以作为泛型的约束类型
*              类中就会有属性和方法
*
*   byte        Byte
*   short       Short
*   int         Integer
*   long        Long
*   float       Float
*   double      Double
*   char        Character
*   boolean     Boolean
*
*   1:每一个包装类 里面都可以传入一个对应的基本数据类型的值
*     每个包装类都可以传入一个字符串类型的值，但是双引号里面的值必须得是包装类对应的基本数据类型的值[除了Character]
*      当boolean类型的包装类里面传入值得时候，是不区分大小写的，除了传入的值是true之外其他的值都是返回 fasle
*       包装类中  如果传入的是null  编译没问题 运行时会出现异常：NumberFormatException
* */
public class TestInteger {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
      /*  list.add("abc");
        list.add(123);*/

      int n1=12;
      Integer n2=new Integer(null);
      Boolean b1 = new Boolean("True1");
        Boolean b2 = new Boolean(false);
        Character c1 = new Character('a');
        System.out.println(n1+" "+n2+","+b1+", "+c1);


    }

}
