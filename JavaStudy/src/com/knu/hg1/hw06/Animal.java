package com.knu.hg1.hw06;

public class Animal {
	private String name;
	
	public Animal(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String bark() {
		return "���������Ҹ�";
	}
}
