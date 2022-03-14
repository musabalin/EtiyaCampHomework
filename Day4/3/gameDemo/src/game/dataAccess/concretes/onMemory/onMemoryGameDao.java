package game.dataAccess.concretes.onMemory;

import game.dataAccess.abstracts.GameDao;
import game.entities.concretes.Game;

import java.util.ArrayList;

public class onMemoryGameDao implements GameDao {

    ArrayList<Game> games;

    public onMemoryGameDao() {
        games = new ArrayList<>();
    }


    @Override
    public void add(Game game) {
        games.add(game);

    }

    @Override
    public void delete(Game game) {
        games.remove(game);
    }

    @Override
    public void update(Game game) {

    }

    @Override
    public ArrayList<Game> getAll() {
        return games;
    }
}
