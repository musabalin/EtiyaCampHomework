package game.business.concretes;

import game.business.abstracts.ValidationService;

public class GamerValidationEdevlet implements ValidationService {
    @Override
    public boolean Validate(String nationalityId, String name, String lastName, String birtdayYear) {
        System.out.println("E-devlette böyle bir vatandaş mevcut.");
        return true;
    }
}
