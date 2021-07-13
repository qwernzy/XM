package com.yy.bean;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * 
 *
 */
public class Test06 {
	public static void main(String[] args) {
		aaa();


	}

	private static int aaa() {
		System.out.println(" * 1.要求用户输入一个计算表达式，可以使用加减乘除。\n" +
				" * 2.只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)\n" +
				" * 例如:\n" +
				" * 1+2\n" +
				" * 然后经过处理计算结果并输出:1+2=3" +
				"请输入您的计算表达式：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] ss={};
		if(str.split("\\+").length>1){
			ss=str.split("\\+");
			System.out.println(ss[0]+"*"+ss[1]+"=");
			int a=Integer.valueOf(ss[0])+Integer.valueOf(ss[1]);
			System.out.println(ss[0]+"+"+ss[1]+"="+a);
			return a;
		}else if(str.split("-").length>1){
			ss=str.split("-");
			int a=Integer.valueOf(ss[0])-Integer.valueOf(ss[1]);
			System.out.println(ss[0]+"-"+ss[1]+"="+a);
			return a;
		}else if(str.split("\\*").length>1){
			ss=str.split("\\*");
			System.out.println(ss[0]+"*"+ss[1]);
			int a=Integer.valueOf(ss[0])*Integer.valueOf(ss[1]);
			System.out.println(ss[0]+"*"+ss[1]+"="+a);
			return a;
		}else if(str.split("/").length>1){
			ss=str.split("/");
			if (Integer.valueOf(ss[1])==0) {
				System.out.println("除数不能为0");
				return -1;
			}
			int a=Integer.valueOf(ss[0])/Integer.valueOf(ss[1]);
			System.out.println(ss[0]+"/"+ss[1]+"="+a);
			return a;
		}else{
			System.out.println("您的输入有误,请仔细查看规则");
			return -1;
		}
	}

	public static int parseInt(String str){
		//最后要生成的数字
		int num = 0;
		//临时变量，用于计算对应位数的数字
		int flag = 0;
		for(int i=0;i<str.length();i++){
			flag = (str.charAt(i)-48);
			/*
			 * 这里是将对应的数字计算为对应的位，例如百位数字就要用该数字乘以10的2次方
			 * 得到
			 * 可以用Math的相关方法处理(自行查看API文档)
			 */
			for(int n=0;n<str.length()-1-i;n++){
				flag*=10;
			}
			num+=flag;
		}
		return num;
	}
}








