package com.yy.bean.Z09;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File("/");
        String[] list = file.list();


            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    f.getName();
                    System.out.println("f = " + f);
                }
            }



    }
}
