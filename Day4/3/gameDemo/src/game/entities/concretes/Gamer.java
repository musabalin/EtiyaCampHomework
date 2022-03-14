package game.entities.concretes;

import game.Core.entities.Entity;

public class Gamer implements Entity {
    private int id;
    private String nationalityId;
    private String firstName;
    private String lastName;
    private String birthdayYear;

    public Gamer() {
    }

    public Gamer(int id, String nationalityId, String firstName, String lastName, String birthdayYear) {
        this.id = id;
        this.nationalityId = nationalityId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(String birthdayYear) {
        this.birthdayYear = birthdayYear;
    }
}
