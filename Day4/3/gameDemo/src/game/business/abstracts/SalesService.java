package game.business.abstracts;

import game.entities.concretes.Campaign;
import game.entities.concretes.Game;
import game.entities.concretes.Gamer;

public interface SalesService {
    void Sales(Gamer gamer, Game game, Campaign campaign);
}
