package com.yy.bean.Z09;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                        String sc = scanner.nextLine();
        File file = new File(sc);
        del(file);


    }

    private static void del(File file) {
        if (file == null) { return ; }
        if (file.exists())
        {
            //是文件？
            if (file.isFile())
            {
                System.out.println(file.getAbsolutePath());
                file.delete();
            }
            //是文件夹？
            else if (file.isDirectory())
            {
                //接收文件夹目录下所有的文件实例
                File[] listFiles = file.listFiles();
                //文件夹为空 递归出口
                if (listFiles == null)
                {
                    return;
                }
                for (File file2 : listFiles)
                {
                    //foreach遍历删除文件 递归
                    del(file2);
                    System.out.println("正在删除文件夹 " + file.getAbsolutePath());
                }

                //递归跳出来的时候删除空文件夹
                System.out.println("正在删除文件夹" + file.getAbsolutePath());
                file.delete();
            }
        }
    }
}
