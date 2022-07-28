package com.banyuan.java;

/*
*  多态：一种事物在不同条件下的不同状态
*   为什么需要用多态呢？
*    简化代码，测试的时候也是只需要改变具体的子类类名就可以
*
*   一定是在继承的情况下
*
*
* */


public class Dog  extends  Pet{
    private String strain;

    public Dog() {
    }

    public Dog(String strain) {
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "strain='" + strain + '\'' +
                '}';
    }

    /*狗狗生病去医院*/
    public void goHospitoal(){

        setHealth(getHealth()+10);
        System.out.println("狗狗生病去医院 打针吃药.....");
    }

    public void playFei(){
        setHealth(getHealth()-5);
        System.out.println("狗狗玩飞盘...");
    }

}
