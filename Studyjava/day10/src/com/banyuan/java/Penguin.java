package com.banyuan.java;

public class Penguin  extends  Pet{
    private String sex;

    public Penguin() {
    }

    public Penguin(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "sex='" + sex + '\'' +
                '}';
    }
    /*企鹅生病去医院*/
    public void goHospitoal(){

        setHealth(getHealth()+5);
        System.out.println("企鹅生病睡觉疗养.....");
    }

    public void swimming(){
        setHealth(getHealth()-10);
        System.out.println("企鹅游泳。。。");
    }


}
