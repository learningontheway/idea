package banking5;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(double init_balance, double interestRate) {
        super(init_balance);
        this.interestRate = interestRate;
    }
}
