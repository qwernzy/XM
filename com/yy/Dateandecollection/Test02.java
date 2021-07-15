package com.yy.Dateandecollection;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 *  
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        String s=sdf.format(date);
        System.out.println("s = " + s);
    }
}
