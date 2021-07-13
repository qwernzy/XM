package com.yy.bean;

public class StirngDemo03 {
    public static void main(String[] args) {
        //          0123456789012345
        String str="thinking in java";
        char c = str.charAt(10);
        System.out.println("c = " + c);
        System.out.println(str.length());
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }


        System.out.println(str.indexOf("i",1));

        System.out.println(str.substring(3,str.length()));

        String st="www.ster.com.cn";

        cn(st);


    }
//作业7
    private static void cn(String st) {
        String s=st.replace("www.","");
        String ss=s.replace(".com.cn","");
        System.out.println(ss);
    }
}
