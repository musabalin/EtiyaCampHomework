package game.business.abstracts;

import game.entities.concretes.Gamer;

import java.util.ArrayList;

public interface GamerService {

    void add(Gamer gamer);
    void delete(Gamer gamer);
    void update(Gamer gamer);
    ArrayList<Gamer> getAll();
}
