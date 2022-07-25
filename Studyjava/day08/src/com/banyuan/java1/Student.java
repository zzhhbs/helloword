package com.banyuan.java1;

/*

    封装:
       作用：将属性隐藏起来，增加属性的安全性避免用户随意赋值
       使用：
       私有化属性  private
       编写getter  /  setter方法
       可以在赋值的时候【setter方法中对用户输入的值进行判断】

* private  修饰的内容只能在本类中访问
*
*
*
* */
public class Student {

  private   String name;
   private String sex;


   public void setName(String name){
       this.name=name;
   }
   public  void setSex(String sex){
       if("男".equals(sex) || "女".equals(sex)){
           this.sex=sex;
       }else{
           System.out.println("性别输入有误");
       }


   }


   public String getName(){
       return name;
   }
   public String getSex(){
       return sex;
   }




    public  void show(){
        System.out.println("姓名是："+name+"，性别是："+sex);
    }

}
