package abstractClasses;

public class Main {
    public static void main(String[] args) {

        ManGameCalculator manGameCalculator=new ManGameCalculator();
        manGameCalculator.calculate();
        manGameCalculator.gameOver();

        GameCalculator gameCalculator=new KidsGameCalculator();
        gameCalculator.calculate();

    }
}
