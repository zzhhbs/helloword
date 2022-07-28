package com.banyuan.java3;

public class TestPrint {

    InkBox inkBox;
    Paper paper;

    public void setInkBox(InkBox inkBox){
        this.inkBox=inkBox;
    }
    public void setPaper(Paper paper){
        this.paper=paper;
    }

    public void show(){
        System.out.println("使用"+inkBox.getColor()+" 在"+paper.getSize()+"的纸张上打印");
    }


}
