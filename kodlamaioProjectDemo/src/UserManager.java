import java.util.ArrayList;

public class UserManager {

    ArrayList<User> users;
    public UserManager(){
        users=new ArrayList<>();
    }


    public void add(User user){
        users.add(user);
    }
    public void delete(User user){
        users.remove(user);
    }
    public ArrayList<User> getAll(){
        return users;
    }
}
