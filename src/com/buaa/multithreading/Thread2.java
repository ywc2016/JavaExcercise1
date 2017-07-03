package com.buaa.multithreading;

/**
 * 使用Runnable接口
 * 
 * @author ywcrm
 * 
 */
class Thread2 implements Runnable {
	private String name;

	public Thread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + "运行  :  " + i);
			try {
				Thread.sleep((int) Math.random() * 10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// 错误的写法
		// new Thread2("C").run();
		// new Thread2("D").run();
		new Thread(new Thread2("C")).start();
		new Thread(new Thread2("D")).start();
	}
}