package com.banyuan.java3;

public class Test {
    public static void main(String[] args) {
        TestPrint print = new TestPrint();
        InkBox inkBox =new Colorful();
        print.setInkBox(inkBox);


        Paper paper = new A4();
        print.setPaper(paper);

        print.show();


    }
}
