package com.banyuan.java;

import  com.banyuan.java2.Pet;

public class Dog  extends Pet {


    private String strain;



    public Dog() {
        super();
        System.out.println("子类的无参构造");

    }

    public Dog(String name, int health, int love, String strain) {
            //super(name,health,love);
       /* this.name = name;
        this.health = health;
        this.love = love;*/
        this.strain = strain;
        System.out.println("子类的有参构造");
    }


    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }


    public  void show(){
       // super.show();
        //super.a=12;
       // System.out.println("strain"+strain+a);
    }


   /* @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                ", strain='" + strain + '\'' +
                '}';
    }*/

   /*
      子类和父类不在同一个包下的情况下：private 和default 修饰的内容
      是不可以被访问的
      子类和父类在同一个包下的情况下：private是不可以被访问的
      public 是处处可访问，default 和protected 在同一个包或者其子类中可以访问
   *
   * */
   public void method(){
       //System.out.println("name:"+name);
       //System.out.println("a:"+a);
       System.out.println("b:"+b);
       System.out.println("c:"+c);
   }

    public Dog mehtod(int a,int b){
        System.out.println();
        return new Dog();
    }

}
