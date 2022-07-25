package com.banyuan.java1;

public class TextStudent {

    public static void main(String[] args) {
        Student student = new Student();
        /*student.name="孙悟空";
        student.sex="桃子";*/
        student.setName("猪八戒");
        student.setSex("男");
        student.show();
        System.out.println(student.getName());
    }

}
