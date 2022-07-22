package cn.banyuan.homework;

public class Account {

    int cid;
    double balance;

    Customer customer =new Customer();

    public String getInfo(){
        String msg="卡号是："+cid+",余额是："+balance+",所属用户是："+customer.name;
        System.out.println(msg);
        return msg;
    }

    public  boolean withdraw(int money){
        if(balance>money){
            balance= balance-money;
            System.out.println("取钱成功,余额为："+balance);

            return true;
        }else{
            System.out.println("取钱失败，余额不足");
            return false;
        }
    }




    public double save(double money){
        balance=balance+money;
        System.out.println("存钱成功，余额为："+balance);
        return  balance;
    }



}
