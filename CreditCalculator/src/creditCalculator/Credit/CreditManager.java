package creditCalculator.Credit;

import creditCalculator.customer.Customer;

import java.util.ArrayList;

public class CreditManager {

    Credit[] credits;

    ArrayList<Credit> creditss;

    public CreditManager(ArrayList<Credit> creditss) {
        this.creditss = creditss;
    }


    public CreditManager(Credit[] credits) {
        this.credits = credits;
    }

    public void getCreditList(Customer customer, double creditAmount, int year) {

      /*  if (credits.length < 1) {
            System.out.println("En az 1 Adet Kredi Seçmelisiniz.");
        } else {

            for (Credit credit : credits
            ) {
                System.out.println(customer.getFirstName() + " ");
                credit.calculate(creditAmount);

            }
        }*/

        //ArrayList
        if (creditss.isEmpty()) {
            System.out.println("En az 1 Adet Kredi Seçmelisiniz.");
        } else {
            for (Credit credit : creditss
            ) {
                System.out.println(customer.getFirstName() + " ");
                credit.calculate(creditAmount, year);
            }

        }
    }
}

