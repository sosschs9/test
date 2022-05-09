package com.knu.hg1.hw05;

public class Account1 extends Account{
	 private String name;
	 private double balance;
	 
	 public Account1(String n) {
		 super();
		 this.name = n;
		 this.balance = 0.0;
	 }

	 public String getName() {
		 return name;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
	 public void credit(double b) {
		 balance = balance + b;
	 }
	 
	 public void print() {
		 System.out.println("������ : " + name);
		 System.out.println("�ܾ� : " + balance);
	 }
	 
	 public void addInterest(double interestRates) {
		 balance = balance * interestRates;
	 }
	 
}
