package com.yy.bean.Z08;

import java.util.ArrayList;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        String[] f={"1","$","2","$","3","$","4"};
        for (int i = 0; i < f.length; i++) {
            if (f[i] == "$") {

            }else{
                a.add(f[i]);
            }
        }
        for (int i = 0; i <a.size(); i++) {
            System.out.println(a.get(i));
        }


    }
}
