package cn.banyuan.hello;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double arr[] = new double[5];
        double sum = 0 ;
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入金额：");
            arr[i] = input.nextDouble();
            sum += arr[i];
        }

        System.out.println("序号\t金额（元）");
        for (int i=0;i<arr.length;i++){
            System.out.println((i+1)+ "\t"+arr[i]);
        }
        System.out.println("总金额为"+sum);

    }
}
