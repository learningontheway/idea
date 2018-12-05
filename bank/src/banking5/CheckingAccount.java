package banking5;

public class CheckingAccount extends Account {
    public double overdraftProtection;

    public CheckingAccount(double init_balance) {
        super(init_balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public boolean withdraw(double money) {

        if (money <= balance) {
            balance -= money;
            System.out.println("取出 " + money + "成功");
            return true;
        } else {
            if (overdraftProtection + balance > money) {
                overdraftProtection = overdraftProtection-(money - balance);
                balance=0;
                System.out.println("账户余额不足，但是额度充足，剩余额度" + overdraftProtection);
                return true;
            } else {
                System.out.println(" 额度不足，取款失败");
                return false;
            }
        }
    }
}



