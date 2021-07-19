package com.yy.bean.Z09;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File("/");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println("file1 = " + file1.getName());
            }

        }
    }

}
