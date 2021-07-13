package com.yy.bean;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * 
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String v="大家好!";
		System.out.println(v+="我是程序员");
		v=v.replace("是","是优秀的");
		System.out.println( v);
		v=v.replace("优秀","牛牛");
		System.out.println(v);
		v=v.replace("大家好!","");
		System.out.println(v);
	}
}
