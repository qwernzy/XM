package com.yy.Dateandecollection;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *  
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);
        long i=1000*60*60*24*3;
        date.setTime(date.getTime()+i);
        System.out.println("data = " + date);
    }
}
