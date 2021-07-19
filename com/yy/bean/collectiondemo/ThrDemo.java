package com.yy.bean.collectiondemo;

public class ThrDemo {
    public static void main(String[] args) {
        Runnable pao = new pao();
        Runnable ting = new ting();

        Thread thread = new Thread(pao);
        Thread thread1 = new Thread(ting);

        thread.start();
        thread1.start();

    }
}
class pao implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 18; i++) {
            System.out.println(i%2==0?"迈左脚====":"迈右脚\t====");
        }
    }
}
class ting implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i%2==0?"换歌0000000000":"看时间\t*****");
        }
    }
}