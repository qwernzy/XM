package com.yy.bean.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class Collectio {
    public static void main(String[] args) {
        Collection a = new ArrayList();
        person ff = new person();
        ff.setAge(18);
        ff.setName("达摩");
        ff.setSg(180);
        a.add(ff);
        a.add("唐僧-达摩");
        a.add("孙悟空-猴子");
        a.add("猪八戒-坦克");
        a.add("白龙马-载具");
        a.add("沙僧-憨厚");

//        int size=a.size();
//        System.out.println("size = " + size);
//        a.clear();
//        boolean empty = a.isEmpty();
//        System.out.println("empty = " + empty);
        for (Object o : a) {
            System.out.println("o = " + o);
        }
    }
}
