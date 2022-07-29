package com.banyuan.java1;

import java.util.Scanner;



/*
*   异常：一种特殊情况
*   结构
*  Object
*       Throwable
*           Exception  异常，是可以避免的
*               运行时异常：编译通过，但是运行不通过
*               编译时异常：编译不通过，不能运行程序
*           error       错误，认为造成的
*
*    常见的异常有哪些？
*       ArithmeticException 数学异常
*       NullPointerException  空指针异常
*       IndexOutOfBoundsException 数组下标越界异常
*        ClassCastException 类型转换异常
*       InputMismatchException  输入类型不匹配异常
*
*
*       try{
*               执行的是 可能有异常的代码
*       }catch(异常类型){
*           打印异常信息
*              【 printStackTrace();  getMessage()】
*       }
*
*       其中 catch 是可以有多个  如果catch()有多个  我们需要将较小的异常类型放在上面
*   较大的范围异常在下面。
*
*       如果程序遇到异常了 那么就不会继续执行代码块里面的后面程序了，而是直接跳转到对应的Catch 块里面
*       如果没有准确的对应捕获异常类型的话 就会跳转到较大的捕获异常类型中。
*
*       当程序中有return和finally的 时候  是先执行finally的内容  后执行return。
*
*       exit(int status)  强制终止程序结束
*
*       如果一个方法异常是上抛没有处理，那么在调用方法的时候需要处理
*
*
*
*
* */

public class TestCri {
    public static void main(String[] args) {

        //演示 类型转换异常
        String str= new String();
        Object a=(Object) str;
        System.out.println(a);




        //演示 数学异常
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数：");
        if(sc.hasNextInt()){
            int n1=sc.nextInt();
            System.out.print("请输入除数：");
            int n2=sc.nextInt();
            if(n2!=0){
                int shang=n1/n2;
                System.out.println("商是："+shang);
            }else{
                System.out.println("除数不能为0");
            }
        }else{
            System.out.println("请输入整数");
        }




    }
}
