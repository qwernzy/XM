package com.yy.util;

import com.yy.entity.User;

import java.util.List;
import java.util.Scanner;

public class TextUtil {
    public static void huanying(){
        System.out.println("**********");
        System.out.println("欢迎使用ATM");
        System.out.println("**********");
    }

    public static void selectall(UserDate users) {
        List<User> users1 = users.getUsers();
        for (User user : users1) {
            System.out.println("user = " + user);
        }
    }
    public static void
    yhjm() {

        System.out.println("用户界面");
        System.out.println("余额：");
        System.out.println("1取钱");
        System.out.println("2转账");
        System.out.println("3存钱");
        System.out.println("4退卡");


    }
}
