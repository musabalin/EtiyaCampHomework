package creditCalculator.Credit;

public class NeedCredit implements Credit{
    private double coefficient;
    @Override
    public void calculate(double creditPrice,int year) {
        coefficient=year*0.21;
        System.out.println(creditPrice+ " TL İhtiyaç Kredisi Alırsanız Ödeyeceğiniz miktar: "+creditPrice*(1+coefficient));
    }
}
