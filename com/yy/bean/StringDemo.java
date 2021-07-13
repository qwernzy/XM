package com.yy.bean;
import java.lang.StringBuilder;
public class StringDemo {
    public static void main(String[] args) {
        //strA();

        String s1="a";

        long l=System.currentTimeMillis();
        for (int i = 0; i <30 ; i++) {
            s1+=s1;
        }

        System.out.println(System.currentTimeMillis()-l);
        //sb(str);


    }

    private static void sb(String str) {
        StringBuilder ab = new StringBuilder(str);
        ab.append("天天向上");
        System.out.println("ab = " + ab);
        ab.replace(2,3,"平a");
        System.out.println("ab = " + ab);
        ab.delete(0,ab.length());
        System.out.println("ab = " + ab);
    }


}
