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
		Person person = new Person();
		System.out.println("BMI:" + person.Bmivalue());
		System.out.println("标准体重:" + person.StdWeight());
		System.out.println("肥胖度:" + person.ObesityDegree());
	}
}

class Person {
	String name = "jack";
	int age = 22;
	double height = 1.77;
	double weight = 63;

	public double Bmivalue() {
		return height / (weight * weight);
	}

	public double StdWeight() {
		return 22 * height * height;
	}

	public double ObesityDegree() {
		return (weight - StdWeight()) / StdWeight() * 100;
	}

	public String Conclusion() {
		if (ObesityDegree() < -10)
			return "瘦";
		else if (ObesityDegree() < 20) {
			if (Bmivalue() < 24.2)
				return "普通";
			else
				return "超重";
		} else
			return "肥胖";
	}

}
