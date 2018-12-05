package banking5;

public class testbanking5 {
    public static void main(String[] args) {
        Bank bank=new Bank();
       Customer customer;
        Account account;
        account=new CheckingAccount(500,600);

        bank.addCustomer("李","磊");
        //把李磊的账户余额设置成500，利率3%，额度为600，分别存20，取530，再取600
        customer=bank.getCustomers(0);
       account.deposit(20);
       account.withdraw(50);
    //   account.withdraw(600);
       account.withdraw(700);
    //    account.withdraw(400);
        account.withdraw(300);


        /*
        bank.addCustomer("李","雷");
        bank.addCustomer("李","名");
        bank.addCustomer("李","冰");
*/

    }

}
