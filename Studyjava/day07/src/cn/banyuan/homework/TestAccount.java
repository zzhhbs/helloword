package cn.banyuan.homework;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance=100;
        account.cid=10010;

        account.customer.name="猪八戒";
        account.getInfo();

        account.withdraw(20);
        account.save(100);

    }
}
