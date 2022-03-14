package game.business.concretes;

import game.business.abstracts.CampaignService;
import game.entities.concretes.Campaign;

import java.util.ArrayList;

public class CampaignManager implements CampaignService {

    ArrayList<Campaign> campaigns;

    public CampaignManager() {
        campaigns = new ArrayList<>();
    }

    @Override
    public void add(Campaign campaign) {
        campaigns.add(campaign);
    }

    @Override
    public void delete(Campaign campaign) {

    }

    @Override
    public void update(Campaign campaign) {

    }

    @Override
    public ArrayList<Campaign> getAll() {
        return campaigns;
    }
}
