package game.business.concretes;

import game.business.abstracts.GamerService;
import game.dataAccess.abstracts.GamerDao;
import game.dataAccess.concretes.onMemory.onMemoryGamerDao;
import game.entities.concretes.Gamer;

import java.util.ArrayList;

public class GamerManager implements GamerService {

    private GamerDao gamerDao;
    GamerValidationEdevlet validationEdevlet;
    ArrayList<Gamer> gamers;

    public GamerManager() {
        gamers = new ArrayList<>();
        validationEdevlet = new GamerValidationEdevlet();
        gamerDao = new onMemoryGamerDao();
    }

    @Override
    public void add(Gamer gamer) {
        if (validationEdevlet.Validate(gamer.getNationalityId(),
                gamer.getFirstName(), gamer.getLastName(), gamer.getBirthdayYear()) == true) {
            gamers.add(gamer);
        }

    }

    @Override
    public void delete(Gamer gamer) {

    }

    @Override
    public void update(Gamer gamer) {

    }

    @Override
    public ArrayList<Gamer> getAll() {
        return null;
    }
}
