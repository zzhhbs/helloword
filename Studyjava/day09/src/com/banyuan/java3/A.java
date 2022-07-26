package com.banyuan.java3;

/*
*  abstract 抽象的
*   abstract 修饰的方法 没有方法体，abstract修饰的方法  一定得在abstract修饰的类中,反过来
* 抽象类中不一定有抽象方法
* 抽象类中的抽象方法一定会被子类重写 ，如果没有重写，除非子类也是抽象类，没被重写的方法需要再被
* 其子类重写。
*
*
* */
public abstract  class A {
   public  abstract void sum();
    public abstract void jian();
   abstract  void jia();
   void  chu(){}

}

abstract  class  B extends  A{
    public void sum(){}
    public  void jian(){}
}
class C extends B{
    void jia(){}
}
