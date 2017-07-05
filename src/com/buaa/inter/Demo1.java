package com.buaa.inter;

public class Demo1 {

	public static void main(String[] args) {
		X a1 = new A();
		Y a2 = new A();
		Z a3 = new A();
		a1.ss();
		a2.mm();
		a3.tt();
	}
}

interface X {
	public void tt();

	public void ss();
}

interface Y {
	public void mm();
}

interface Z extends X, Y {
}

class A implements Z {

	@Override
	public void tt() {
		System.out.println("tt");
	}

	@Override
	public void ss() {
		System.out.println("ss");
	}

	@Override
	public void mm() {
		System.out.println("mm");
	}

}