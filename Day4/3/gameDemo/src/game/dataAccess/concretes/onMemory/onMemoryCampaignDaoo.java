package game.dataAccess.concretes.onMemory;

import game.dataAccess.abstracts.CampaignDao;
import game.entities.concretes.Campaign;

import java.util.ArrayList;

public class onMemoryCampaignDaoo implements CampaignDao {

    private ArrayList<Campaign> campaigns;

    public onMemoryCampaignDaoo() {
        this.campaigns = new ArrayList<Campaign>();
    }

    @Override
    public void add(Campaign campaign) {
        campaigns.add(campaign);

    }

    @Override
    public void delete(Campaign campaign) {
        campaigns.remove(campaign);
    }

    @Override
    public void update(Campaign campaign) {

    }

    @Override
    public ArrayList<Campaign> getAll() {
        return campaigns;
    }
}
