package com.yy.Dateandecollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 *  
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入生产日期格式yyyy-MM-dd");
        String s = scanner.nextLine();
        String[] split = s.split("-");

        System.out.println("保质期的天数:");
        long sc = scanner.nextLong();
        long times =sc*24*60*60*1000;

        SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");

        try {
            long pr = sim.parse(s).getTime()+times-86400000*14;//一天86400妙
            Date d=new Date(pr);

            String format = sim.format(d);
            String[] sp = format.split("-");
            c.set(Integer.valueOf(sp[0]),Integer.valueOf(sp[1]),Integer.valueOf(sp[2]));
            c.set(Calendar.DAY_OF_WEEK,4);

            System.out.println(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日"+c.get(Calendar.DAY_OF_WEEK));
        } catch (ParseException e) {
            System.out.println("日期输入错误");
            e.printStackTrace();
        }





    }
}