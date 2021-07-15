package com.yy.bean.Z08;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i <=9; i++) {
            l.add(i);
        }
        List<Integer> integers = l.subList(3, 8);
        for (int i = 0; i < integers.size(); i++) {
            integers.set(i,l.get(i)*10);
        }
        System.out.println("integers = " + integers);
        l.subList(7, 9).clear();
    }
}
