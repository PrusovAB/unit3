package seminars.third.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();
    List<User> loginedUsers = new ArrayList<>();


    public List<User> getAllUsers() {
        return this.data;
    }

    public List<User> getAllLoginedUsers() {
        for (User user : data) {
            if (user.isLogin) {
                loginedUsers.add(user);
            }
        }
        return loginedUsers;
    }

    public void addUser(User user) {
       this.data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void login(User user) {
        if(findByName(user.name)) {
            user.isLogin = true;
        }
    }

    public void unlogin(User user) {
        if(findByName(user.name)) {
            user.isLogin = false;
        }
    }

    public void unloginAllExceptAdministrators() {
        for (User user : data) {
            if (user.isAdmin.equals(false)) {
                user.isLogin = false;
            }
        }
    }
}