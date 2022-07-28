package com.banyuan.java;

/*
*  宠物的主人类  带不同宠物去医院
*
* */
public class Master {



    /*带宠物去玩的方法*/
    public void play(Pet pet){
        /*如果想调用子类特有的方法  需要判断传入的参数是什么 然后向下转型*/
        if(pet instanceof  Dog){
            Dog dog=(Dog)pet;
            dog.playFei();
        }else if(pet instanceof  Penguin){
            Penguin penguin =(Penguin) pet;
            penguin.swimming();
        }
    }



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
