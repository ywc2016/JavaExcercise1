package com.buaa.generic;

/**
 * 有界类型
 * 
 * @author ywcrm
 * 
 */
public class Demo5 {

}

class Stats<T extends Number> {
	T[] nums; // array of Number or subclass

	Stats(T[] o) {
		this.nums = o;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}

	// boolean sameAvg(Stats<T> ob) {
	// if (average() == ob.average()) {
	// return true;
	// }
	// return false;
	// }

	boolean sameAvg(Stats<?> ob) {
		if (average() == ob.average())
			return true;
		return false;
	}

}

class BoundsDemo {

	public static void main(String args[]) {

		// Integer inums[] = { 1, 2, 3, 4, 5 };
		// Stats<Integer> iob = new Stats<Integer>(inums);
		// double v = iob.average();
		// System.out.println("iob average is " + v);
		// Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		// Stats<Double> dob = new Stats<Double>(dnums);
		// double w = dob.average();
		// System.out.println("dob average is " + w);

		// 下面的语句不能编译，因为String不是Number的子类
		// String strs[] = { "1", "2", "3", "4", "5" };
		// Stats<String> strob = new Stats<String>(strs);
		// double x = strob.average();
		// System.out.println("strob average is " + v); }

		Integer inums1[] = { 1, 2, 3, 4, 5 };
		Double dnums1[] = { 1d, 2d, 3d, 4d, 5d };// { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Integer> iob1 = new Stats<Integer>(inums1);
		Stats<Double> dob1 = new Stats<Double>(dnums1);
		if (iob1.sameAvg(dob1)) {
			System.out.println("are the same.");
		} else {
			System.out.println("differ.");
		}

	}

}
