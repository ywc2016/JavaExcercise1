package com.buaa.reflection;

import java.lang.reflect.Method;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 动态操纵method
 * 
 * @author ywcrm
 * 
 */
public class Demo2 {
	public static void main(String[] args) throws Exception {

		User user = new User();
		Class userClass = user.getClass();

		// System.out.println("获得当前类以及超类的所有 public Method ");
		// Method[] publicMethods = userClass.getMethods();
		// for (Method method : publicMethods) {
		// System.out.println(method);
		// }

		// System.out.println("获得当前类自己申明的所有Method");
		// Method[] currentMethods = userClass.getDeclaredMethods();
		// for (Method method : currentMethods) {
		// System.out.println(method);
		// }

		// System.out.println("获得当前类以及超类的所有 public Method setBaseId: ");
		// Method setBaseIdMethod = userClass.getMethod("setBaseId", int.class);
		// System.out.println(setBaseIdMethod);

		System.out.println("获得当前类的Method setId");
		Method setIdMethod = userClass.getDeclaredMethod("setId", int.class);
		System.out.println(setIdMethod);

		setIdMethod.invoke(user, 110);
		System.out.println("id = " + user.getId());
	}
}
