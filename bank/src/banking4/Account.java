package banking4;

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

   public boolean deposit(double money){

       balance+=money;
       System.out.println("存入"+money+"成功");
       return true;

   }
   public boolean withdraw(double money){

       if(money<=balance){
           balance-=money;
           System.out.println("取出 "+money+"成功");
           return true;
       }
       else {
           System.out.println("余额不足，取款失败");
           return false;
       }
   }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
