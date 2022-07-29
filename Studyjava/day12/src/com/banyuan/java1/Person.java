package com.banyuan.java1;

public class Person {
    private String sex;

    public void  setSex(String sex){
        if("男".equals(sex) || "女".equals(sex)){
            this.sex=sex;
        }else{
           // System.out.println("错误");
            try {
                //throw new Exception("性别有误");
                throw new MyException("性别有误~~");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
