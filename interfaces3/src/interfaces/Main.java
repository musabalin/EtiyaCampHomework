package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Logger[] loggers={new FileLogger(),new DatabaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer customer1 = new Customer(0, "Musa", "Balın");
        customerManager.add(customer1);

    }
}
