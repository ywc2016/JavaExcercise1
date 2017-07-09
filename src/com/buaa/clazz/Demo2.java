package com.buaa.clazz;

import java.util.Date;

public class Demo2 {

}

class Teacher extends Person {
	private String title;

	public static void main(String[] args) {
		// Teacher teacher = new Teacher();
		// teacher.name = "JiaSuLing";
		// teacher.title = "Professor";

		// Math.min(1, 2);
		// Math.min(12.2, 222.2);
		Object manager = new Manager();
		Employee employee = ((Employee) manager);
	}

}

class Employee {
	public String name;
	public double salary;
	public Date birthDate;

	public Employee() {
		System.out.println("Employee");
	}

	public String getDetails() {
		return "name:" + name + "\n" + "salary:" + salary;
	}
}

class Manager extends Employee {
	public String department;

	public String getDetails() {
		return "name:" + name + "\n" + "salary:" + salary + "\n"
				+ "Manager of:" + department;
	}

	public Manager() {
		super();
	}
}

// class test {
// public void printtest() {
// System.out.println("ss");
// }
//
// public int printtest() {
// return 1;
// }
// }
