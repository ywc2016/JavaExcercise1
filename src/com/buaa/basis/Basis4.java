package com.buaa.basis;

/**
 * 类
 * 
 * @author ywcrm
 * 
 */
public class Basis4 {

	private int age;

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 如果写了其他的有参构造方法,不会默认添加无参构造方法
	 */
	public Basis4() {

	}

	public Basis4(int age) {
		setAge(age);
	}

	public static void main(String[] args) {
		Basis4 basis4 = new Basis4();
	}
}

class Basis4Ext extends Basis4 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Basis4Ext basis4Ext = new Basis4Ext();
		int age = basis4Ext.getAge();

		// 多态
		Basis4 basis4 = new Basis4Ext();
		
		((Basis4Ext)basis4).setName("123");
		
	}
}
