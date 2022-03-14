package game.business.abstracts;

import game.entities.concretes.Campaign;
import game.entities.concretes.Gamer;

import java.util.ArrayList;

public interface CampaignService {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
    ArrayList<Campaign> getAll();
}
