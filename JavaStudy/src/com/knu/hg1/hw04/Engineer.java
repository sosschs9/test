package com.knu.hg1.hw04;

public class Engineer extends Employee {
	int overWorkingDay;
	int overWorkingPay;
	int annualSalary;
	
	Engineer(){
		super();
	}
	
	public void setOverworkingDay(int day) {
		this.overWorkingDay = day;
		this.overWorkingPay = this.overWorkingDay * 3;
		this.annualSalary = (salary + overWorkingPay) * 12;
	}
	
	public int getOverworkingPay() {
		//this.overWorkingPay = this.overWorkingDay * 3;
		return overWorkingPay;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;	
	}
	
	public int getAnnualSalary() {
		//this.annualSalary = (salary + overWorkingPay) * 12;
		return annualSalary;
	}
	
	public void printEmployee() {
		tempPrintEmployee();
		System.out.print(this.overWorkingPay +" "+ this.salary +" "+ this.annualSalary);
	}
}
