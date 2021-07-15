package com.yy.Dateandecollection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
     Date date = new Date();
//        System.out.println("date = " + date);
//        long time = date.getTime();
//        System.out.println("time = " + time);
//        long tim = date.getTime();
//        System.out.println("tim = " + tim);
//        date.setTime(1626227238968L);
//        System.out.println(date);
//
//        long i=1000*60*60*24*10;
//        date.setTime(date.getTime()+i);
//        System.out.println(date);

        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
        String dd=sdf.format(date);
    }
}
