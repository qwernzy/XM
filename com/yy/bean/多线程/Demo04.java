package com.yy.bean.多线程;

import java.util.Random;

public class Demo04 {
    public static int time=5;
    public static int password= new Random().nextInt(100);

    public static void main(String[] args) {
        System.out.println(password);
        //炸弹倒计时
        Thread thread = new Thread() {
        @Override
            public void run(){
                time-=1;
            try {
                Thread.sleep(1000);
                if (time == 0) {
                    System.out.println("炸弹爆炸了");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        };
        Thread thread1 = new Thread() {
            @Override
            public void run(){

                System.out.println();
            }
        };

    }
}