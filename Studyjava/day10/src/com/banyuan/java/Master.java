package com.banyuan.java;

/*
*  宠物的主人类  带不同宠物去医院
*
* */
public class Master {


    public void toHospital(Pet pet){
        if(pet.getHealth()<60){
            /*非健康状态 带gougou去医院*/
            pet.goHospitoal();

        }else{
            System.out.println("狗狗很健康...");
        }

    }




    /*带狗狗去医院*/

   /* public void toHospital(Dog dog){
        if(dog.getHealth()<60){
            *//*非健康状态 带gougou去医院*//*
            dog.goHospitoal();

        }else{
            System.out.println("狗狗很健康...");
        }

    }


    public void toHospital(Penguin penguin){
        if(penguin.getHealth()<80){
            *//*非健康状态 带gougou去医院*//*
            penguin.goHospitoal();

        }else{
            System.out.println("企鹅很健康...");
        }

    }*/




}
