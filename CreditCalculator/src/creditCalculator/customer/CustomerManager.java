package creditCalculator.customer;

import java.util.ArrayList;

public class CustomerManager {

    ArrayList<Customer> customers;
    public CustomerManager(){
        customers=new ArrayList<>();
    }

    public void add(Customer customer){
        customers.add(customer);
    }

}
