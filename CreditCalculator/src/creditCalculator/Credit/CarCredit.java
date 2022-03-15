package creditCalculator.Credit;


public class CarCredit implements Credit {
    private double coefficient;


    @Override
    public void calculate(double creditPrice, int year) {

        coefficient=year*0.18;

        System.out.println(creditPrice + " TL Araç Kredisi Alırsanız Ödeyeceğiniz miktar: " + creditPrice*(1+coefficient));

    }
}
