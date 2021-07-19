package com.yy.bean.多线程;

public class Demo01 {
        public static void main(String[] args) {
            Yyk yyk = new Yyk();

            Thread t = new Thread(){
                @Override
                public void run(){
                    try {
                        yyk.mai();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread t2 = new Thread(){
                @Override
                public void run(){
                    try {
                        yyk.mai();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        t.start();
        t2.start();
        }
}
class Yyk{
    public  void mai() throws InterruptedException {
        Thread t=Thread.currentThread();
        System.out.println("选衣服");
        Thread.sleep(3000);
        synchronized (this){
            Thread.sleep(3000);
            System.out.println("试衣间试衣服");
        }


    }
}
