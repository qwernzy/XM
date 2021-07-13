package com.yy.bean;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * 
 *
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("请输入邮箱");
		        Scanner scanner = new Scanner(System.in);

		                String sc = scanner.nextLine();
		String[] split = sc.split("@");
		String s=split[0];
		System.out.println(s);

	}
}
