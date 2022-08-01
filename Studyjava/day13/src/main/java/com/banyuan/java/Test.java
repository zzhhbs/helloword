package com.banyuan.java;

public class Test {
    public void add(int i) throws NullPointerException{
        if(i==0)
            throw new NullPointerException();
        System.out.println("add出现异常");
    }
    public static void main(String[] args) {
        Test t = new Test();
        try{
            t.add(0);
            System.out.println("add方法返回");
        }catch(Exception e){
            System.out.println("捕获异常");
        }
    }
}

