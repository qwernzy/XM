package com.yy.util;

import com.yy.entity.User;
import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;
//用单例模式客户初始化
public class UserDate {
    private static UserDate ourInstance = new UserDate();

    public static UserDate getOurInstance() {
        return ourInstance;
    }

    public static void setOurInstance(UserDate ourInstance) {
        UserDate.ourInstance = ourInstance;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private List<User> users;
    @Contract(pure = true)
    public static UserDate getInstance() {
        return ourInstance;
    }


    public UserDate() {
        users=new ArrayList<>();
        for (int i=0;i<10;i++) {
            User user=new User();
                user.setId("5201314"+i);
                user.setPwd("123");
                user.setCname("钢铁侠"+i+"号");
                user.setPhone("1307261579"+i);
                user.setQian(10000.0);
             users.add(user);
        }
    }
}
