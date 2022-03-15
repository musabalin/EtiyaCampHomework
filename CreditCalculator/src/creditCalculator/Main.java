package creditCalculator;

import creditCalculator.Credit.*;
import creditCalculator.customer.Customer;
import creditCalculator.customer.CustomerManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Musa", "Balın", "Development Specialist");
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(customer1);

        Credit[] credits = {new CarCredit(), new NeedCredit()};

        ArrayList<Credit> credits1 = new ArrayList<>();
        credits1.add(new NeedCredit());
        credits1.add(new CarCredit());
        credits1.add(new OfficerCredit());


       /* CreditManager creditManager=new CreditManager(credits);
        creditManager.getCreditList(customer1,50000);*/

        CreditManager creditManager1 = new CreditManager(credits1);
        creditManager1.getCreditList(customer1, 50000,2);

    }
}
