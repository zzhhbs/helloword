package cn.banyuan.java2;

import java.util.Scanner;

public class TestStudentBiz {
    public static void main(String[] args) {

        StudentBiz studentBiz = new StudentBiz();
        String name[]=new String[5];
        Scanner sc=new Scanner(System.in);
      // studentBiz.addName();
        for(int i=0;i<name.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            name[i]=sc.next();
            studentBiz.addName(name[i]);
        }

        studentBiz.showName();

        System.out.print("开始位置start:");
        int s=sc.nextInt();
        System.out.print("结束end:");
        int e=sc.nextInt();
        System.out.print("找的名称name:");
        String n=sc.next();

        boolean flag=studentBiz.searchName(s,e,n);
        if(flag){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }

    }
}
