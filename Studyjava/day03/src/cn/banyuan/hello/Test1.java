package cn.banyuan.hello;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        *   能被2整除的就是偶数  反之就是奇数
        *   就是取余等于0
        *
        *
        * */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入有个数：");
        int num=sc.nextInt();
        if(num % 2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }*/



        int [][] arr ={{1,5,3,2,9},{1,4},{9,61}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }


    }
}
