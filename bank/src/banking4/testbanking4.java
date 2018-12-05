package banking4;

public class testbanking4 {
    public static void main(String[] args){
        Bank bank=new Bank();
        bank.addCustomer("李","磊");
        bank.addCustomer("李","雷");
        bank.addCustomer("李","名");
        bank.addCustomer("李","冰");

        System.out.println(bank);
    }
}
