package day5homework.dataAccess.concretes;

import day5homework.dataAccess.abstracts.IUserDao;
import day5homework.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements IUserDao {

    ArrayList<User> users;

    public UserDao() {
        users = new ArrayList<>();
    }

    @Override
    public void add(User user) {
        users.add(user);
        System.out.println(user.getFirstName() + " isimli kullancı eklendi.");

    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println(user.getFirstName() + " isimli kulllanıcı silindi.");

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void logIn(String email, String password) {


    }

    @Override
    public ArrayList<User> getAll() {
        return users;
    }
}
