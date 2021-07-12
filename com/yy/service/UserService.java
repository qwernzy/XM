package com.yy.service;

import com.yy.util.TextUtil;
import com.yy.util.UserDate;
import com.yy.entity.User;

import java.util.List;
import java.util.Scanner;

public class UserService {


    public static User inputKM() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入卡号");
        String id=sc.nextLine();
        System.out.println("请输入密码");
        String pwd=sc.nextLine();
       User ut=new User();
       ut.setId(id);
       ut.setPwd(pwd);
        return ut;
    }

    /*public static void checkPWD(String id, String pwd) {
        for (User user : users) {
            if (user.getId().equals(id) && user.getPwd().equals(pwd)) {
                System.out.println("登陆成功");
                while(true){
                    TextUtil.yhjm();
                    boolean c =gn();
                    if (c) {
                        break;
                    }
                }

            }else{
                System.out.println("登陆失败");
            }
        }
    }
    */

    public static boolean gn(int c) {

        UserDate userd = UserDate.getInstance();
         List<User> users = userd.getUsers();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (User user : users) {
            System.out.println("user = " + user);
        }
        switch (s) {
            case "1":

                System.out.println("你想取多少钱？\n请输入数额（输入整数，我吐不出硬币）");
                int ss = sc.nextInt();

                users.get(c).setQian(users.get(c).getQian()-ss);
                System.out.println(users.get(c).getQian());
                return true;
            case "2":
                System.out.println(" 你想给谁转账？");
                String card = sc.nextLine();
                System.out.println(" 转多少钱？ ");
                int q=sc.nextInt();
                System.out.println("card = " + card);

                for (int caid = 0; caid < users.size() ; caid++) {
                    if (card.equals(users.get(caid).getId())) {
                        users.get(c).setQian(users.get(c).getQian()-q);
                        users.get(caid).setQian(users.get(caid).getQian()+q);
                        System.out.println("转账成功");
                        return true;
                    }
                }
                return true;
            case "3":
                System.out.println("存钱");
                System.out.println(" 存多少钱？ ");
                int qadd=sc.nextInt();
                users.get(c).setQian(users.get(c).getQian()+qadd);
                return true;
            case "4":
                System.out.println("退卡");
                return false;
            case "520":

            default:


                System.out.println("请输入正确的功能序号！");
                return true;
        }

    }
}