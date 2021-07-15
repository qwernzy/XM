package com.yy.Dateandecollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
  
 *
 */
public class Test03 {
    public static void main(String[] args) {
        dd();

    }

    private static void dd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入人生日，格式为yyyy-MM-dd");
        String sc = scanner.nextLine();
        //sc.split("-");
        String strDateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        long i = new Date().getTime();

        try {

            Date parse = sdf.parse(sc);
            i-=parse.getTime();
            System.out.println("您已经在《地球OL》连续在线"+i/86400000/7+"周");
        } catch (ParseException e) {
            System.out.println("您的输入的日期格式有误，请仔细填写");
            e.printStackTrace();
        }
    }
}
