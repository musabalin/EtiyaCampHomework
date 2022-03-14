package game.business.abstracts;

import game.entities.concretes.Gamer;

public interface ValidationService {

    boolean Validate(String nationalityId, String name, String lastName, String birtdayYear);

}
