package com.buaa.homework;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example7().count();
	}

	public void count() {
		int abcCount = 0;// 英文字母个数
		int spaceCount = 0;// 空格键个数
		int numCount = 0;// 数字个数
		int otherCount = 0;// 其他字符个数
		System.out.println("请输入一个字符串:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				// 判断是否字母
				abcCount++;
			} else if (Character.isDigit(ch[i])) {
				// 判断是否数字
				numCount++;
			} else if (Character.isSpaceChar(ch[i])) {
				// 判断是否空格键
				spaceCount++;
			} else {
				// 以上都不是则认为是其他字符
				otherCount++;
			}
		}
		System.out.println("字母个数：" + abcCount);
		System.out.println("数字个数：" + numCount);
		System.out.println("空格个数：" + spaceCount);
		System.out.println("其他字符个数：" + otherCount);
	}

}
