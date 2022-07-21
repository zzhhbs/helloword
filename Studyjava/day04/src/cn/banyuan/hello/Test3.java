package cn.banyuan.hello;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int  arr[] ={8,4,2,1,23,344,12};

       /* for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

       /* int sum=0;
        for(int i=0;i<arr.length;i++){
          sum+= arr[i];
        }
        System.out.println(sum);*/

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n =sc.nextInt();

        boolean flag=false;    //  false  不包含  true  包含

        for(int i=0;i<arr.length;i++) {

                    if(arr[i]==n){
                        flag=true;
                        break;
                    }
        }
        if(flag){
            System.out.println("包含");
        }else{
            System.out.println("不包含");
        }



    }
}
