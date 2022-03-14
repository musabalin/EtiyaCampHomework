package game.dataAccess.abstracts;

import game.Core.dataAccess.BaseRepository;
import game.entities.concretes.Game;

import java.util.ArrayList;

public interface GameDao {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
    ArrayList<Game> getAll();

}
