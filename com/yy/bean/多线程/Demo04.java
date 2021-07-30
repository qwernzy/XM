package com.yy.bean.多线程;

import java.util.Random;

public class Demo04 {

    public static int time=5;
    public static boolean boom=false;
    public static int password= new Random().nextInt(100);
    public static int i=0;
    public static void main(String[] args) {

        System.out.println(password);
        //炸弹倒计时
        Thread thread = new Thread() {
        @Override
            public void run(){


            try {
                while (time>=0&&!boom){
                    if (time == 0) {
                        System.out.println("任务失败，炸弹已经爆炸了");
                        boom=true;
                      break;
                    }
                    time--;
                    System.out.println("时间： " + time);
                    Thread.sleep(1000);
                        

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        };
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!boom){
                        if (password==i){
                            System.out.println("任务成功，成功拆解炸弹");
                            boom=true;
                            Thread.interrupted();

                        }else {
                            i=new Random().nextInt(100);
                            Thread.sleep(45);
                            }
                        }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
    thread.start();
    thread1.start();


    }
}
