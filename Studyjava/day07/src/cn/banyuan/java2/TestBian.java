package cn.banyuan.java2;

public class TestBian {
    //全局变量
    int num=20;
    //int m;


    public void show1(){
        //局部变量
        int num=2021;
        System.out.println(num);
    }
    public void show(){
        //局部变量
        // int num=202;
        System.out.println(num);
        //int m;
        //System.out.println("m:"+m);
    }


    public static void main(String[] args) {
        TestBian t=new TestBian();
        t.show();
    }
}
