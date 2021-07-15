package com.yy.bean.Z08;

import java.util.ArrayList;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        String[] f={"one","two","three","four"};
        for (int i = 0; i < f.length; i++) {
                a.add(f[i]);
        }
        System.out.println("a.get(1) = " + a.get(1));
        a.set(2,"3");
        System.out.println( a.get(2));
        a.add(1,"2");
        System.out.println("a = " + a);
        a.remove(2);
        System.out.println("a = " + a);
    }
}
