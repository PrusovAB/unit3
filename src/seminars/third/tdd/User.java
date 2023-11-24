package seminars.third.tdd;

public class User {

    String name;
    String password;
    Boolean isAdmin;
    Boolean isLogin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

}