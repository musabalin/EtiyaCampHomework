package game.business.abstracts;


import game.entities.concretes.Game;

import java.util.ArrayList;

public interface GameService {

    void add(Game game);

    void delete(Game game);

    void update(Game game);

    ArrayList<Game> getAll();

}
