package day5homework.business.concretes;

import day5homework.dataAccess.abstracts.IUserDao;
import day5homework.dataAccess.concretes.UserDao;
import day5homework.entities.concretes.User;

import java.util.ArrayList;

public class VerificationManager {
    ArrayList<String> emails;
    IUserDao userDao;
    UserManager userManager;

    public VerificationManager() {
        userDao = new UserDao();
        emails = new ArrayList<String>();
        userManager = new UserManager();

    }

    public void sendEmail(User user) {
        System.out.println("Doğrulama kodu gönderilmiştir.");
        activation(user);
    }

    public void activation(User user) {

        for (String e : emails
        ) {
            if (getEmails().contains(e)) {
                userManager.add(user);
                System.out.println("Üyelik tamamlanmıştır.");
            }
        }
    }

    public ArrayList<String> getEmails() {
        for (User users : userDao.getAll()
        ) {
            emails.add(users.getEmail());

        }
        return emails;
    }

}
