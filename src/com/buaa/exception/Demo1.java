package com.buaa.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常
 * 
 * @author ywcrm
 * 
 */
public class Demo1 {

	public static void main(String[] args) {

		// 非运行时异常,必须显示捕获,否则不能通过编译

		// try {
		// File file = new File("1.txt");
		// FileInputStream fis = new FileInputStream(file);
		// } catch (FileNotFoundException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		// 运行时异常
		FileInputStream fis = null;
		try {
			File file = new File("1.txt");
			fis = new FileInputStream(file);
			int a = 1 / 0;

		} catch (Exception e) {
			int b = 1 / 0;
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
