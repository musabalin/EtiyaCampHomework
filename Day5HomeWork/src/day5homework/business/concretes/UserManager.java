package day5homework.business.concretes;

import day5homework.dataAccess.abstracts.IUserDao;
import day5homework.entities.concretes.User;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager {
    IUserDao userDao;
    ArrayList<User> users;
    private String email;
    private String regex = "^(.+)@(.+)$";
    VerificationManager verificationManager;

    public UserManager() {
    }

    public UserManager(IUserDao userDao) {
        this.userDao = userDao;
        verificationManager = new VerificationManager();
        users = new ArrayList<User>();
    }

    public void signUp(User user) {
        email = user.getEmail();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            if (getAll().stream().noneMatch(user1 -> user1.getEmail() == user.getEmail())) {
               // verificationManager.sendEmail(user);
            } else {
                System.out.println("Kayıtlı bir kullanıcı girdiniz.");
            }
        } else {
            System.out.println("Yanlış bir e-posta girdiniz.");
        }
    }

    public void add(User user) {
        users.add(user);
    }


    public void delete(User user) {
        userDao.delete(user);
    }

    public void logIn(String email, String password) {
        for (User users : getAll()
        ) {
            if (email == users.getEmail() && password == users.getPassword()) {
                System.out.println("Hoş Geldin " + users.getFirstName() + " " + users.getLastName());
            }
        }
    }

    public ArrayList<User> getAll() {
        return userDao.getAll();
    }
}
