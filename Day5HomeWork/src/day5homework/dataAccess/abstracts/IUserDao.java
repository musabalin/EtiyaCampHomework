package day5homework.dataAccess.abstracts;

import day5homework.entities.concretes.User;

import java.util.ArrayList;

public interface IUserDao {
    public void add(User user);
    public void delete(User user);
    public void update(User user);
    public void logIn(String email,String password);
    public ArrayList<User> getAll();
}
