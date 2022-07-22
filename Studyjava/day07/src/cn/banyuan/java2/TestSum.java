package cn.banyuan.java2;

public class TestSum {

    /*计算两个数之和*/
    public int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        TestSum t=new TestSum();

       int result= t.sum(1,2);
        System.out.println(result);
    }

}
