package com.yy.bean.collectiondemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Arr {
    public static void main(String[] args) {
       List<person> people = new ArrayList<>();
        person diaochan= new person();
        diaochan.setName("貂蝉");
        diaochan.setAge(19);
        diaochan.setSg(168);
        person sun= new person();
        sun.setName("孙尚香");
        sun.setAge(19);
        sun.setSg(168);
        person qiao= new person();
        qiao.setName("大桥");
        qiao.setAge(19);
        qiao.setSg(168);

        people.add(diaochan);
        people.add(qiao);
        people.add(sun);
        List<String> namss=new ArrayList<>();
        for (int i = 0; i <people.size() ; i++) {
            namss.add(people.get(i).getName());
        }
        System.out.println("namss = " + namss);
        people.stream().map(person::getName).collect(Collectors.toList());
    }
}
