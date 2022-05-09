package com.knu.hg1.hw05;
import java.util.Scanner;

public class Report2 {
	static Scanner scan = new Scanner(System.in);

	static void method1(){
		Account1 account1 = new Account1("account1");
		Account1 account2 = new Account1("account2");
		
		System.out.print("Enter deposit amount for account1: ");
		account1.credit(scan.nextDouble());
		System.out.print("Enter deposit amount for account2: ");
		account2.credit(scan.nextDouble());
		
		System.out.println("account1 balance: $" + account1.getBalance());
		System.out.println("account2 balance: $" + account2.getBalance());
		
		System.out.print("\n");
	}
	static void method2() {
		Account1 account = new Account1("ȫ�浿");
		account.credit(1000.0);
		account.print();
		
		account.addInterest(1.1);
		account.print();
		
		System.out.print("\n");
	}
	static void method3() {
		int first, second;
		
		System.out.print("Enter first integer: ");
		first = scan.nextInt();
		System.out.print("Enter second integer: ");
		second = scan.nextInt();
		
		System.out.println("Sum is " + (first+second));
		System.out.println("Product is " + first*second);
		System.out.println("Difference is " + (first-second));
		System.out.println("Quotient is " + first/second);
	
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
}
