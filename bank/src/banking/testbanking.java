package banking;

public class testbanking {
    public static void main(String[] args){
        System.out.println("创建一个初始账户余额为500的账户");
        Account account=new Account(500.00);
        account.withdraw(150.00);
        account.deposit(22.50);
        account.withdraw(47.62);
        System.out.println("当前账户余额为 "+account.getBalance());
    }
}
