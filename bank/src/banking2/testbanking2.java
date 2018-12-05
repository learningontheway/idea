package banking2;

public class testbanking2 {
    public  static void main(String[] args){
        System.out.println("创建一个名叫‘jane Smith’的customer，初始余额为500");
        Customer customer=new Customer("jane" ,"Smith");
        customer.setBalance(500);
        customer.withdraw(150.00);
       customer.deposit(22.50);
        customer.withdraw(47.62);
        System.out.println("当前账户余额为 "+customer.getBalance());

    }
}
