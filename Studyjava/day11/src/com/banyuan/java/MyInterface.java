package com.banyuan.java;

public interface MyInterface {
    /*1.接口中方法不可以有方法体  默认是abstract 修饰
    * 2.接口不可以实例化
    * 3.接口中的变量都是静态常量
    * 4.一个类只能单继承，但是可以多实现，实现的时候多个接口中间用逗号隔开
    *  如果一个类又继承又实现，则需要把继承放前面， 实现放后面。
    *
    *
    * */
    int m=10;
    void show();
    void method();

}
interface  M{

}

class C implements MyInterface, M{

    @Override
    public void show() {

    }

    @Override
    public void method() {

    }
}
 abstract  class A implements MyInterface{


    public void show() {

    }


}class  B extends  A  implements  M{

   static final int num=10;
    @Override
    public void method() {

    }
}

