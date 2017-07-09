package com.buaa.inter;

public class Demo2 {

}

interface Flyer {
	public void takeOff();

	public void land();

	public void fly();
}

interface Int {
	public void f1();
}

class Airplane implements Flyer, Int {

	@Override
	public void takeOff() {

	}

	@Override
	public void land() {

	}

	@Override
	public void fly() {

	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
}

class Bird implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

}
