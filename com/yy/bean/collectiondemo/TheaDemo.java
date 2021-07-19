package com.yy.bean.collectiondemo;

public class TheaDemo {
    public static void main(String[] args) {
        Thread thread = new paobu();
        Thread thread1 = new tingge();
        thread.start();
        thread1.start();
    }

}
class paobu extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <5000 ; i++) {
            System.out.println(i%2==0?"迈左脚====":"迈右脚\t====");
        }
    }
}
class tingge extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <700 ; i++) {
            System.out.println(i%2==0?"换首歌":"看眼手机时间");
        }
    }
}

