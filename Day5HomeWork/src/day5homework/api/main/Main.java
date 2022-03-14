package day5homework.api.main;

import day5homework.business.concretes.UserManager;
import day5homework.dataAccess.abstracts.IUserDao;
import day5homework.dataAccess.concretes.UserDao;
import day5homework.entities.concretes.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1=new User(1,"Musa","Balın","musabalin@aa.com","123456");
        User user2=new User(1,"Musa","Balın","musabalin@aa.com","123456");
        UserManager userManager=new UserManager(new UserDao());
        userManager.signUp(user1);
        userManager.signUp(user2);

        for (User user: userManager.getAll()
             ) {
            System.out.println(user.getFirstName());

        }

    }
}
