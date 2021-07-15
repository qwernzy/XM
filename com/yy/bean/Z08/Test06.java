package com.yy.bean.Z08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        String[] f={"one","two","three"};
        for (int i = 0; i < f.length; i++) {

                a.add(f[i]);

        }
        System.out.println("a = " + a);
    }
}
