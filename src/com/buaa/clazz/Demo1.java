package com.buaa.clazz;

import java.util.Date;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 类
 * 
 * @author ywcrm
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		Manager x = new Manager();
		x.name = "Jack";
		x.salary = 5000;
		System.out.println(x.getDetails());

	}
}

class Employee {
	public String name;
	public double salary;
	public Date birthDate;

	public String getDetails() {
		return name + " " + salary;
	}

}

class Manager extends Employee {
	public String department;
}
