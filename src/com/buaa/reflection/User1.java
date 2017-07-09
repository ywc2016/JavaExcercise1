package com.buaa.reflection;

public class User1 {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User1() {
		super();
	}

	public User1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
}
