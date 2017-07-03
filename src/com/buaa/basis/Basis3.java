package com.buaa.basis;

/**
 * 数据类型
 * 
 * @author ywcrm
 * 
 */
public class Basis3 {

	public static void main(String[] args) {
		// 基本数据类型
		byte b1 = 127;// byte范围 -128-127
		short b2 = 22222;
		int b3 = 4344;
		long b4 = 222244444;

		float f1 = 1.2f;
		// float f2 = 1.2;//浮点数默认是double
		double f3 = 3.2;

		boolean bool = true;

		char c = 'A';

		// 非基本数据类型,类
		String s1 = "hello,world.\n";

		Integer i1 = new Integer(200);
		int i2 = i1.intValue();
		int i3 = Integer.parseInt("200");
		
	}
}
