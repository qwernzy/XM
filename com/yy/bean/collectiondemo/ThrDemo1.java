package com.yy.bean.collectiondemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrDemo1 {
    public static void main(String[] args) throws InterruptedException {
        int i=0;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        while (true){
            Date date = new Date();

            System.out.println("time = " + simpleDateFormat.format(date));
                Thread.sleep(1000);
            }

    }
}
