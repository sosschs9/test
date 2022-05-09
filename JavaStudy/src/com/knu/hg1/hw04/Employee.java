package com.knu.hg1.hw04;

public class Employee {
	int age;
	String posi;
	String name;
	int salary;
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public void setPosition(String position) {
		this.posi = position;
	}
	
	public void setName(String firstname, String lastname) {
		this.name = firstname + " " + lastname;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void tempPrintEmployee() {
		System.out.print(name +" "+ age +" "+ posi +" ");
	}
	
	public void printEmployee() {
		tempPrintEmployee();
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getPosition() {
		return posi;
	}
	
	public int getAge() {
		return age;
	}
}

