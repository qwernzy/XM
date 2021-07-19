package com.yy.bean.Z09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2016-03-23 14:22:16
 * @author Xiloer
 *
 */
public class Test01 {
    public static void main(String[] args) {
        File file = new File("/DDDD/src/com/yy/bean/Z09/myfile.txt");
        SimpleDateFormat si= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);
            String name = file.getName();
            System.out.println("name = " + name);
            String format = si.format(file.lastModified());
            System.out.println("format = " + format);
            long length = file.length();
            System.out.println("length = " + length);
        } catch (IOException e) {
            System.out.println("创建文件失败");
            e.printStackTrace();
        }
    }
}
