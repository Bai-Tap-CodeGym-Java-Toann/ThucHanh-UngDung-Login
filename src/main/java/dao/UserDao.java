package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users = new ArrayList<>();

    static {
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Toan");
        u1.setAccount("toandz");
        u1.setEmail("toandz@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Tung");
        u2.setAccount("OliverTung");
        u2.setEmail("Oliver@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
