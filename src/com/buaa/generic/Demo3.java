package com.buaa.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.naming.ldap.SortControl;

/**
 * 泛型排序
 * 
 * @author ywcrm
 * 
 */
public class Demo3 {

	public static <E extends Comparable<E>> void sort(E[] list) {
		List<E> list2 = Arrays.asList(list);
		Collections.sort(list2);
	}

	public static void main(String[] args) {
		Integer[] array = { 5, 67, 89, 34, 2, 0, 18, 18, 9 };
		String[] strings = { "Java", "Delphi", "C", "C#", "C++", "PL/SQL" };
		Demo3.sort(array);
		for (Integer integer : array) {
			System.out.println(integer.intValue());
		}
		Demo3.sort(strings);
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
