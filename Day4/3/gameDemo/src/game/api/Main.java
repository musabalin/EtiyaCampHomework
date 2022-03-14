package game.api;

import game.business.concretes.SalesManager;
import game.entities.concretes.Campaign;
import game.entities.concretes.Game;
import game.entities.concretes.Gamer;

public class Main {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer(1, "2213441", "Musa", "Balın", "1997");
        Campaign campaign1 = new Campaign(1, "Doğum günü indirimi", 25);
        Game game1 = new Game();
        game1.setPrice(155);
        game1.setGameName("GTA V");

        SalesManager salesManager=new SalesManager();
        salesManager.Sales(gamer1,game1,campaign1);


    }
}
