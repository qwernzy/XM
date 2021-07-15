package com.yy.bean.Z08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Xiloer
 *
 */
public class Test07 {
    public static void main(String[] args) {
        List<Integer> in=new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i <=9; i++) {
            in.add(r.nextInt(100));
        }
        in.sort(Comparator.naturalOrder());
        System.out.println("in = " + in);
    }

}
