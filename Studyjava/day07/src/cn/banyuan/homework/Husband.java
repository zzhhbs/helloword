package cn.banyuan.homework;

public class Husband {
    String name;
    int age;

    //自定义的类作为属性
    Wife wife =new Wife();


    public void getInfo(){
        System.out.println("丈夫的名字是："+name+
                ",丈夫的年龄是："+age);


        wife.getInfo();
    }
}
