package banking;

public class Account {
    //balance定义了当前的账户余额信息
    private double balance;

    public Account() {
    }
    public Account(double init_balance) {
        this.balance = init_balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

   public void deposit(double money){
        System.out.println("存入 "+money);
        balance+=money;

   }
   public void withdraw(double money){
       System.out.println("取出 "+money);
       balance-=money;
   }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
