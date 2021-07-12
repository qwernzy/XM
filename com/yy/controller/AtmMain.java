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


    public static void main(String[] args) {

       while (true){
           int i=0;
           UserDate userd = UserDate.getInstance();
           List<User> users = userd.getUsers();
           //登录
           TextUtil.huanying();
           User ut=UserService.inputKM();
           System.out.println("ut = " + ut);

           if (i > 5) {
               System.out.println("输入密码错误次数大于五次，您的银行卡已被封禁");
                break;
           }
           for (int c=0;c<users.size();c++) {

               if (users.get(c).getId().equals(ut.getId()) && users.get(c).getPwd().equals(ut.getPwd())) {
                   System.out.println("登陆成功");

                   while(true){

                       TextUtil.yhjm();
                       System.out.println("您的余额为 " + users.get(c).getQian()+"\n请输入功能序号");
                       boolean asd=true;
                       if (asd==false) {
                           break;
                       }else {
                           gn(c);
                       }
                   }

               }else{
                   i++;
               }
           }


       }

    }



    private static void d(@NotNull String id,String pwd){
        if (id.length() ==8 ) {

        }
    }
}
