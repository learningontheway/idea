package banking5;

import java.util.Arrays;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank(){
        customers = new Customer[5];
    }


    public Customer getCustomers(int index) {
        return customers[index];
    }




    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public void addCustomer(String firstname,String lastname){
        Customer customer=new Customer(firstname,lastname);
       customers[numberOfCustomer]=customer;
        numberOfCustomer++;

    }

    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + Arrays.toString(customers) +
                ", numberOfCustomer=" + numberOfCustomer +
                '}';
    }
}
