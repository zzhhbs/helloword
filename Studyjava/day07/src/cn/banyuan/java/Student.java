package cn.banyuan.java;

public class Student {

    public static void main(String[] args) {
        Student stu= new Student();
       // stu.note();
        stu.score();

    }



    public void note(){
        System.out.println("学生记笔记方法");
    }

    public int score(){
        Teacher t =new Teacher();
        t.note();
        System.out.println("kaoshi....");
        //note();
        return 99;
    }

}

class Teacher{

    public void note(){
        System.out.println("老师记笔记方法");
    }
    public void talk(){
        System.out.println("讲课....");
    }

}
