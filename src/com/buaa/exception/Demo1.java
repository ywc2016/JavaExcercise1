package com.buaa.exception;

import java.io.File;
import java.io.FileInputStream;

/**
 * 异常
 * 
 * @author ywcrm
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		// 非运行时异常,必须显示补货,否则不能通过编译
		try {
			File file = new File("1.txt");
			FileInputStream fis = new FileInputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 运行时异常
		try {
			int a = 1 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
