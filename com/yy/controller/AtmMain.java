package com.yy.controller;


import com.yy.util.UserDate;
import com.yy.entity.User;
import com.yy.service.UserService;
import com.yy.util.TextUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.yy.service.UserService.gn;

public class AtmMain {
    private static String id;
    private static String pwd;
     private UserService us=new UserService();

    public static void main(String[] args) {

       while (true){
           int i=0;
           UserDate userd = UserDate.getInstance();
           List<User> users = userd.getUsers();
           //登录
           TextUtil.huanying();
           User ut=UserService.inputKM();
           System.out.println("ut = " + ut);
           i++;
           if (i > 5) {
                break;
           }
           for (User user : users) {
               System.out.println("user = " + user);
           }

           for (int c=0;c<users.size();c++) {

               if (users.get(c).getId().equals(ut.getId()) && users.get(c).getPwd().equals(ut.getPwd())) {
                   System.out.println("登陆成功");

                   while(true){

                       TextUtil.yhjm();
                       System.out.println("您的余额为 " + users.get(c).getQian()+"\n请输入功能序号");
                       boolean asd=gn(c);
                       if (asd==false) {
                           break;
                       }
                   }

               }
           }


       }

    }



    private static void d(@NotNull String id,String pwd){
        if (id.length() ==6 ) {

        }
    }
}
