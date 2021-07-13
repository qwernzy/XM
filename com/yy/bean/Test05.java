package com.yy.bean;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 */
public class Test05 {
	public static void main(String[] args) {
		yzm();
	}
	private static boolean yzm() {
		//65-90,97-122
		Random dd = new Random();
		String s="";		//初始化一哈等会就是验证码
		for (int i = 0; i <5 ; i++) {
			int a =dd.nextInt(10)>5?dd.nextInt(26)+97:dd.nextInt(26)+65;
			char d=(char)a;
			 String ss =String.valueOf(d);
			 s+=ss;
		}
		System.out.println("请输入后边的验证码= " + s);
		Scanner scanner = new Scanner(System.in);
		String sc = scanner.nextLine();
		if (sc.equalsIgnoreCase(s)){
			System.out.println("输入正确");
			return true;
		}else {
			System.out.println("输入错误");
			return false;
		}
	}

}
