package com.yy.Dateandecollection;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
  
 *
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.println("输入生日格式yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println("s = " + s);
        String[] sp = s.split("-");

        Calendar in = Calendar.getInstance();

in.set(Integer.valueOf(sp[0])+20,Integer.valueOf(sp[1]),Integer.valueOf(sp[2]));

        System.out.println(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
    }
}
