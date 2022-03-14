package game.dataAccess.abstracts;

import game.Core.dataAccess.BaseRepository;
import game.entities.concretes.Gamer;

import java.util.ArrayList;

public interface GamerDao {
    void add(Gamer gamer);

    void delete(Gamer gamer);

    void update(Gamer gamer);

    ArrayList<Gamer> getAll();

}
