package com.yy.bean.Z08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
        int[] in={0,1,2,3,4,5,6,7,8,9};

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i <=9; i++) {
            l.add(Integer.valueOf(in[i]));
        }
        System.out.println("l = " + l);
    }
}
