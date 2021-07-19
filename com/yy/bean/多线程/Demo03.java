package com.yy.bean.多线程;

public class Demo03 {
    public static void main(String[] args) {

        Shop2 shop2 = new Shop2();
        Thread t= new Thread(){
            @Override
            public void run(){
                try {
                    shop2.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Thread t1= new Thread(){
            @Override
            public void run(){
                try {
                    shop2.buy2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        t1.start();
        t.start();
    }
}
class Shop2{
    public static void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("选衣服"  );
        thread.sleep(3000);
        System.out.println("试衣服 " );
        thread.sleep(3000);
        System.out.println("出门" );
    }
    public static void buy2() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("买冰淇淋");


    }

}