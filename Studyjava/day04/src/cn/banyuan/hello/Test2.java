package cn.banyuan.hello;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        //声明一个5个长度的数组  来存5个学生的成绩
        int [] scores=new int[5];
        Scanner sc =new Scanner(System.in);
         //声明变量  求和
        int  sum=0;
        for(int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"学生的成绩;");
            scores[i]=sc.nextInt();
            sum+=scores[i];
        }
        int avg=  sum/scores.length;
        System.out.println("平均分是："+avg);


    }



}
