package cn.banyuan.homework;

import java.util.Scanner;

public class Guest {

    String name;
    int age;

    public void show(){
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("输入名字：");
            name =sc.next();
            if("n".equals(name)){
                break;
            }
            System.out.println("输入年龄：");
            age=sc.nextInt();
            if(age<18 || age>60){
                System.out.println("免费");
            }else{
                System.out.println("门票20元");
            }
        }while(!"n".equals(name));

        System.out.println("程序结束");

    }

}
