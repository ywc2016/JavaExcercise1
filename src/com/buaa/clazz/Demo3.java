package com.buaa.clazz;

public class Demo3 {

}

abstract class Animal {
	public abstract void eat();
}

class Dog extends Animal {
	public void eat() {
		System.out.println("狗吃骨头");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃老鼠");
	}
}

class Wolf extends Animal {
	public void eat() {
		System.out.println("吃喜羊羊");
	}
}
