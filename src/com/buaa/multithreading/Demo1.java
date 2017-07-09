package com.buaa.multithreading;

/**
 * 死锁
 * 
 * @author ywcrm
 * 
 */
class Demo1 implements Runnable {
	private boolean flag;

	Demo1(boolean flag) {
		this.flag = flag;
	}

	public void run() {
		if (flag) {
			while (true) {
				synchronized (MyLock.locka) {
					System.out.println(Thread.currentThread().getName()
							+ "...if locka ");
					synchronized (MyLock.lockb) {
						System.out.println(Thread.currentThread().getName()
								+ "..if lockb");
					}
				}
			}
		} else {
			while (true) {
				synchronized (MyLock.lockb) {
					System.out.println(Thread.currentThread().getName()
							+ "..else lockb");
					synchronized (MyLock.locka) {
						System.out.println(Thread.currentThread().getName()
								+ ".....else locka");
					}
				}
			}
		}
	}
}

class MyLock {
	static Object locka = new Object(); /* 静态，能用类名直接调用 */
	static Object lockb = new Object();
}

class DeadLockTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Demo1(true));
		Thread t2 = new Thread(new Demo1(false));
		t1.start();
		t2.start();
	}
}