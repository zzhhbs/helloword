package com.banyuan.java;

public class TestDog {
    public static void main(String[] args) {
       // Dog dog = new Dog();  //调用子类无参构造方法的时候，如果子类无参构造中没有显示的调用
        //父类的构造方法的话 会默认调用父类的无参构造方法
       // dog.getStrain();
        //dog.show();

        Dog dog = new Dog("ww",99,99,"ty");



    }
}
