package cn.banyuan.homework;

import java.util.Scanner;

public class User {
    String name="admin";
    String pwd="abc123";

    public void updatePwd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入name:");
        String userName=scanner.next();
        System.out.println("输入pwd:");
        String password=scanner.next();


        if(name.equals(userName) && pwd.equals(password)){
            System.out.println("输入新密码：");
            pwd=scanner.next();
            System.out.println("修改成功");
        }else{
            System.out.println("失败");
        }

    }


}
