package cn.banyuan.homework;

public class Customer {
    String name;
    int cardId;
    int tel;

    public String say(){
        String msg="姓名是："+name+",身份证号是："+cardId+",电话是："+tel;
        return msg;
    }

}
