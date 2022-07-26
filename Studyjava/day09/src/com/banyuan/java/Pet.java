package com.banyuan.java;

public class Pet {
//私有化的内容是不能被继承的
    private  String name;
    private int health;
    private int love;

    int a;   //默认修饰符修饰的内容 如果不和子类在同一个包下的话 是不可以被继承

    protected  int b;
    public int c;

    /*构造方法不能被继承*/
    public Pet() {
        System.out.println("父类的无参构造....");
    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
        System.out.println("父类的有参构造....");
        //this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }


    public  void show(){
        System.out.println("name:"+name+",health:"+health+",love:"+love);
    }

    public Pet mehtod(int a,int b){
        System.out.println();
        return new Pet();
    }



}
