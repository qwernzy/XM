package com.yy.bean.collectiondemo;

import java.io.File;

/**
 * @author
 */
class IoDome01 {
    public static void main(String[] args) {
        all(new File("D:/R"));
    }

    private static void all(File file) {
        File[] files = file.listFiles();
        for (File file1 : files)
            if (file1.isDirectory()) {
                all(file1);
            } else if (file1.isFile()) {
                String[] split = file1.getName().split("\\.");
                boolean aClass = split[split.length - 1].equals("class")?true:split[split.length - 1].equals("java")?true:false;//第二题+第一题
                if (aClass) {
                    System.out.println("file1 = " + file1.getName());
                }
            }
    }

}