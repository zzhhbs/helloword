package com.banyuan.java;

public class TestPet {
    public static void main(String[] args) {

        Master master = new Master();

        /*测试主人带宠物出去玩的方法*/
        Pet pet = new Penguin();
        master.play(pet);





        /*
        *  抽象类是不可以创建对象的的
        * 如何让其表示指向的某个具体的宠物呢
        *  父类  对象的引用 = new  子类（）；
        * 对象的引用指向子类的实例
        *
        * */
       /* Pet pet = new Penguin();
        pet.setHealth(50);
        master.toHospital(pet);
        System.out.println(pet.getHealth());*/




       /* Dog dog = new Dog();
        dog.setHealth(10);

        master.toHospital(dog);
        System.out.println(dog.getHealth());*/


      /*  Penguin p = new Penguin();
        p.setHealth(60);
        master.toHospital(p);
        System.out.println(p.getHealth());*/


    }
}
