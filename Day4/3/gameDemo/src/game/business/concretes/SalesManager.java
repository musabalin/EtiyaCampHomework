package game.business.concretes;

import game.business.abstracts.SalesService;
import game.entities.concretes.Campaign;
import game.entities.concretes.Game;
import game.entities.concretes.Gamer;

public class SalesManager implements SalesService {


    @Override
    public void Sales(Gamer gamer, Game game, Campaign campaign) {

        System.out.println(gamer.getFirstName() + " " + game.getGameName() + " isimli oyunu almıştır");
        System.out.println(campaign.getName() + " indirimi uygulanmıştır.");
        System.out.println(game.getPrice() + "-" + campaign.getAmount() + "=" + (game.getPrice() - campaign.getAmount()));
    }
}
