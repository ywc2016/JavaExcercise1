package com.buaa.multithreading;

/*
 单例设计模式。 必须要记住，面试题
 饿汉式与懒汉式的区别
 1.懒汉式是延时加载的形式
 2.懒汉式由于是延时加载，所以在多线程中会出现安全问题
 3.可以加同步函数或者同步代码块来解决，而同步函数每次都需要判断比较慢
 4.这里采用同步代码块来解决安全问题
 5.由于函数是静态的，所以锁是类名.class

 */
//饿汉式。

//class Single {
//	private static final Single s = new Single();
//
//	private Single() {
//	}
//
//	public static Single getInstance() {
//		return s;
//	}
//
//}

// 懒汉式

class Single {
	private static Single s = null;

	private Single() {
	}

	public static Single getInstance() {
		if (s == null) {
			synchronized (Single.class) {
				if (s == null)
					s = new Single();
			}
		}

//		if (s == null) {
//			s = new Single();
//			return s;
//		}
		return s;
	}
}

class SingleDemo {
	public static void main(String[] args) {
	}
}