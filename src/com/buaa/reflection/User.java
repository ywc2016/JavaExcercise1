package com.buaa.reflection;

public class User extends BaseUser {

	private int id;
	private String name;

	public User() {
	}

	public User(String name) {
		this.name = name;

	}

	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
