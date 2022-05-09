package com.knu.hg1.hw04;

public class Staff extends Employee {
	int annualSalary;
	
	Staff(){
		super();
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
		this.annualSalary = salary * 12;
	}
	
	public int getAnnualSalary() {
		return annualSalary;
	}
	
	public void printEmployee() {
		tempPrintEmployee();
		System.out.print(this.salary +" "+ this.annualSalary);
	}
}
