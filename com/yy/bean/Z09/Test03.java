package com.yy.bean.Z09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Xiloer
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入目录名称:");
        String input = scan.nextLine().trim();
        File file = new File(input);
        boolean b = file.exists();
        if (!b) {
            boolean mkdir = file.mkdir();
            System.out.println("mkdir = " + mkdir);
        }else {
            int i=1;
            while (b){
                file=new File(input+"副本"+i);
                file.exists();
            }
            i++;
            boolean mkdir = file.mkdir();
            System.out.println("mkdir = " + mkdir);
        }

    }
}

