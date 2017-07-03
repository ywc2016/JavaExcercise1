package com.buaa.reflection;

/**
 * 反射,动态实例化
 * 
 * @author ywcrm
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
		Class userClass;
		// 3种获取类类型的方式
		// userClass = User.class;
		// userClass = new User().getClass();
		try {
			userClass = Class.forName("com.buaa.reflection.User");
			User user = (User) userClass.newInstance();
			System.out.println("1.反射实例化(无参):" + user);

			User user2 = (User) userClass.getConstructor(new Class[] {})
					.newInstance(new Object[] {});
			System.out.println("2.反射实例化(无参):" + user2);

			User user3 = (User) userClass.getConstructor(
					new Class[] { String.class }).newInstance(
					new Object[] { "天府" });
			System.out.println("3.反射实例化(带参):" + user3 + " 属性name的值: "
					+ user3.getName());

			User user4 = new User();
			System.out.println("正常实例化:" + user4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
