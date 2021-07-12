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


        return fz(c, users, sc, s);

    }

    private static boolean fz(int c, List<User> users, Scanner sc, String s) {

        switch (s) {
            case "1":

                quqian(c, users, sc);

                return true;
            case "2":
                zhuanzhang(c, users, sc);
                return true;
            case "3":
                cunqian(c, users, sc);
                return true;
            case "4":
                System.out.println("退卡");
                return false;
            case "520":
                bianli(users);
                return true;
            default:
                System.out.println("请输入正确的功能序号！");
                return true;
        }
    }

    private static void bianli(List<User> users) {
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }

    private static void cunqian(int c, List<User> users, Scanner sc) {
        System.out.println("存钱");
        System.out.println(" 存多少钱？ (存入最小金额100元存款金额应为100的倍数小额面值将会被当做假币吞入)");
        int qadd=sc.nextInt()%100;
        users.get(c).setQian(users.get(c).getQian()+qadd);
    }

    private static void zhuanzhang(int c, List<User> users, Scanner sc) {
        System.out.println(" 你想给谁转账？");
        String card = sc.nextLine();
        System.out.println(" 转多少钱？ ");
        double q=sc.nextDouble();
        if (q > users.get(c).getQian()) {
            for (int caid = 0; caid < users.size() ; caid++) {
                if (card.equals(users.get(caid).getId())) {
                    users.get(c).setQian(users.get(c).getQian()-q);
                    users.get(caid).setQian(users.get(caid).getQian()+q);
                    System.out.println("转账成功");



                }
            }
        }else {
            System.out.println("您的账户余额不足，您的账户余额为："+users.get(c).getQian());

        }





    }

    private static void quqian(int c, List<User> users, Scanner sc) {
        System.out.println("你想取多少钱？\n请输入数额（输入整数，我吐不出硬币）");
        int ss = sc.nextInt();
        if (ss  > users.get(c).getQian()) {
            users.get(c).setQian(users.get(c).getQian()-ss);
            System.out.println(users.get(c).getQian());
        }else {
            System.out.println("您的账户余额不足，您的账户余额为："+users.get(c).getQian());
        }

//        if (ss  > users.get(c).getQian()) {
//
//        }else {
//                      System.out.println("您的账户余额不足，您的账户余额为："+users.get(c).getQian());
//        }
    }
}