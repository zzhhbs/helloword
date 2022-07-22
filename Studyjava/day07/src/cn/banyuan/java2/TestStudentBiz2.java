package cn.banyuan.java2;

public class TestStudentBiz2 {
    public static void main(String[] args) {

        StudentBiz s=new StudentBiz();
        Student student = new Student();
        student.name="唐僧";
        student.age=120;
        student.score=99;

        Student student2 = new Student();
        student2.name="唐僧2";
        student2.age=1202;
        student2.score=992;

        s.addStus(student);
        s.addStus(student2);

        s.showStus();

    }
}
