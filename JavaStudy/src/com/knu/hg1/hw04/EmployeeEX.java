package com.knu.hg1.hw04;
import java.util.Scanner;

public class EmployeeEX {
	static void setdata(Staff[] staffs, Engineer[] engineers) {
		staffs[0].setName("John", "Smith");
		staffs[0].setAge(25);
		staffs[0].setPosition("Newcomer");
		staffs[0].setSalary(300);
		
		staffs[1].setName("Marry", "Anne");
		staffs[1].setAge(45);
		staffs[1].setPosition("Executive");
		staffs[1].setSalary(600);
		
		staffs[2].setName("Sue", "Jones");
		staffs[2].setAge(38);
		staffs[2].setPosition("Office Manager");
		staffs[2].setSalary(450);
		
		engineers[0].setName("Bob", "Lewis");
		engineers[0].setAge(28);
		engineers[0].setPosition("Junior Engineer");
		engineers[0].setSalary(350);
		engineers[0].setOverworkingDay(17);
		
		engineers[1].setName("Lisa", "Barnes");
		engineers[1].setAge(37);
		engineers[1].setPosition("Senior Engineer");
		engineers[1].setSalary(580);
		engineers[1].setOverworkingDay(20);
		
		engineers[2].setName("Michael", "Kevin");
		engineers[2].setAge(46);
		engineers[2].setPosition("SW Manager");
		engineers[2].setSalary(650);
		engineers[2].setOverworkingDay(20);
	}
	static void printMenu(Staff[] staffs, Engineer[] engineers, Scanner scan) {
		while(true) {
			System.out.println("========================================================");
			System.out.println("1. Display all employees' information (Staff, Engineer)");
			System.out.println("2. Display all staffs' information");
			System.out.println("3. Display all engineers' information");
			System.out.println("4. Display all employees' name, salary, annual salary");
			System.out.println("5. Display all employees' name, position");
			System.out.println("0. Quit");
			System.out.println("========================================================");
			
			switch(scan.nextInt()) {
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;
			case 1:
				System.out.println("[Staff]");
				for(int i = 0; i<staffs.length; i++) {
					staffs[i].printEmployee();
					System.out.println("");
				}
				
				System.out.println("[Engineer]");
				for(int i = 0; i<engineers.length; i++) {
					engineers[i].printEmployee();
					System.out.println("");
				}
				break;
			case 2:
				System.out.println("[Staff]");
				for(int i = 0; i<staffs.length; i++) {
					staffs[i].printEmployee();
					System.out.println("");
				}
				break;
			case 3:
				System.out.println("[Engineer]");
				for(int i = 0; i<engineers.length; i++) {
					engineers[i].printEmployee();
					System.out.println("");
				}
				break;
			case 4:
				System.out.println("[Staff]");
				for(int i = 0; i<staffs.length; i++) {
					System.out.println(staffs[i].getName()+" "+staffs[i].getSalary()+" "+staffs[i].getAnnualSalary());
				}
				System.out.println("[Engineer]");
				for(int i = 0; i<engineers.length; i++) {
					System.out.println(engineers[i].getName()+" "+engineers[i].getSalary()+" "+engineers[i].getAnnualSalary());
				}
				break;
			case 5:
				System.out.println("[Staff]");
				for(int i = 0; i<staffs.length; i++) {
					System.out.println(staffs[i].getName()+" "+staffs[i].getPosition());
				}
				System.out.println("[Engineer]");
				for(int i = 0; i<engineers.length; i++) {
					System.out.println(engineers[i].getName()+" "+engineers[i].getPosition());
				}
				break;
			default:
				System.out.println("Wrong input. Try again!");
				break;
			}
		
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Staff[] staffs = new Staff[3];
		Engineer[] engineers = new Engineer[3];
	
		for(int i = 0; i<staffs.length; i++)
			staffs[i] = new Staff();
		for(int i = 0; i<engineers.length; i++)
			engineers[i] = new Engineer();
		
		setdata(staffs, engineers);
		printMenu(staffs, engineers, scan);
		
		scan.close();
	}
}
