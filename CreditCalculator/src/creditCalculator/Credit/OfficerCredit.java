package creditCalculator.Credit;

public class OfficerCredit implements Credit {
    private double coefficient;
    @Override
    public void calculate(double creditPrice,int year) {
        coefficient=year*0.2;
        System.out.println(creditPrice+ " TL Memur Kredisi Alırsanız Ödeyeceğiniz miktar: "+creditPrice*(1+coefficient));
    }
}
