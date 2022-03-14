package game.dataAccess.concretes.onMemory;

import game.dataAccess.abstracts.GamerDao;
import game.entities.concretes.Gamer;

import java.util.ArrayList;

public class onMemoryGamerDao implements GamerDao {

    ArrayList<Gamer> gamers;

    public onMemoryGamerDao() {
        gamers = new ArrayList<>();
    }

    @Override
    public void add(Gamer gamer) {
        gamers.add(gamer);

    }

    @Override
    public void delete(Gamer gamer) {
        gamers.remove(gamer);
    }

    @Override
    public void update(Gamer gamer) {

    }

    @Override
    public ArrayList<Gamer> getAll() {
        return gamers;
    }
}
