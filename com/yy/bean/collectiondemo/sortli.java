package com.yy.bean.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortli {
    public static void main(String[] args) {
           List<Integer> li=new ArrayList<>();
           li.add(50);
           li.add(30);
           li.add(49);
           li.add(32);
           li.add(55);
        Collections.sort(li);
        System.out.println("li = " + li);
        List<String> lis=new ArrayList<>();
        lis.add("阿飞");
        lis.add("白起");
        lis.add("曹操");
        System.out.println("lis = " + lis);
        Collections.sort(lis);
        System.out.println("lis = " + lis);
        List<person> p=new ArrayList<>();
       person p1 = new person();
       p1.setSg(189);
       p1.setName("白起");
       p1.setAge(23);
       person p2= new person();
        p2.setSg(184);
        p2.setName("李信");
        p2.setAge(28);
       person p3= new person();
        p3.setSg(169);
        p3.setName("曹操");
        p3.setAge(22);
       person p4= new person();
        p4.setSg(178);
        p4.setName("扁鹊");
        p4.setAge(24);
       person p5 = new person();
        p5.setSg(184);
        p5.setName("诸葛亮");
        p5.setAge(29);

        p.add(p5);
        p.add(p4);
        p.add(p3);
        p.add(p2);
        p.add(p1);

        Collections.sort(p);
        System.out.println("p = " + p);
        Collections.reverse(p);
        System.out.println("p = " + p);
    }
}
