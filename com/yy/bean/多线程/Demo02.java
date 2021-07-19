package com.yy.bean.多线程;

public class Demo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Thread t = new Thread(){
            @Override
            public void run(){
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                try {
                    shop.buy();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
        t2.start();
    }


}
class Shop{
    public static void buy() throws InterruptedException {
        Thread thread = Thread.currentThread();
        System.out.println("选衣服"  );
        thread.sleep(3000);
        System.out.println("试衣服 " );
        thread.sleep(3000);
        System.out.println("出门" );
    }

}