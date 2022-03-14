package game.dataAccess.abstracts;

import game.Core.dataAccess.BaseRepository;
import game.entities.concretes.Campaign;

import java.util.ArrayList;

public interface CampaignDao {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
    ArrayList<Campaign> getAll();

}
