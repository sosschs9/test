// 2021111849 송혜경
import java.util.Scanner;

public class EmployeeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee[] employee = new Employee[5];
		for(int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
		}
		
		employee[0].setAge(28);
		employee[0].setName("John", "Smith");
		employee[0].setPosition("Senior Software Engineer");
		employee[0].setSalary(300);
		
		employee[1].setAge(24);
		employee[1].setName("Kim", "Young");
		employee[1].setPosition("Junior Software Engineer");
		employee[1].setSalary(250);
		
		employee[2].setAge(37);
		employee[2].setName("Lisa", "Barnes");
		employee[2].setPosition("Team Leader");
		employee[2].setSalary(580);
		
		employee[3].setAge(46);
		employee[3].setName("Michael", "Kevin");
		employee[3].setPosition("Project Manager");
		employee[3].setSalary(650);
		
		employee[4].setAge(35);
		employee[4].setName("Mary", "Anne");
		employee[4].setPosition("Senior Software Enfineer");
		employee[4].setSalary(350);
		
		int ch_index;
		String ch_posi;
		int ch_salary;
		
		while(true) {
			System.out.println("==================================");
			System.out.println(" Employee Management System ");
			System.out.println("==================================");
			System.out.println("1. Display Employees' Information");
			System.out.println("2. Change Employee's Position");
			System.out.println("3. Change Employee's Salary");
			System.out.println("0. Quit");
			System.out.println("==================================");
			System.out.print("-> ");
			
			switch(scan.nextInt()) {
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;
				
			case 1:
				System.out.println("\t\tName\tAge\t\t\tPosition\tSalary");
				System.out.println("-----------------------------------------------------------------------");
				for (int i = 0; i < employee.length; i++) {
					System.out.printf("[%2d]", i+1);
					employee[i].printEmployeeInfo();
				}
				System.out.println("-----------------------------------------------------------------------");
				break;
				
			case 2:
				for(int i = 0; i < employee.length; i++)
					System.out.printf("[%2d] %15s %30s\n", i+1, employee[i].fullName, employee[i].position);
					
				while (true) {
					System.out.print("Input index(1~5) and new position: ");
					ch_index = scan.nextInt();
					if (ch_index >= 1 && ch_index <= 5) break;
					else System.out.println("Wrong index. Type again.");
				}
				ch_posi = scan.nextLine();
				employee[ch_index-1].position = ch_posi;
				System.out.println("-----------------------------------------------------");
				System.out.printf("[%2d] %15s %30s\n", ch_index, employee[ch_index-1].fullName, employee[ch_index-1].position);
				System.out.println("-----------------------------------------------------");
				break;
				
			case 3:
				for(int i = 0; i < employee.length; i++)
					System.out.printf("[%2d] %15s %30d\n", i+1, employee[i].fullName, employee[i].salary);
					
				while (true) {
					System.out.print("Input index and new salary: ");
					ch_index = scan.nextInt();
					if (ch_index >= 1 && ch_index <= 5) break;
					else System.out.println("Wrong index. Type again.");
				}
				ch_salary = scan.nextInt();
				employee[ch_index-1].salary = ch_salary;
				System.out.println("-----------------------------------------------------");
				System.out.printf("[%2d] %15s %30d\n", ch_index, employee[ch_index-1].fullName, employee[ch_index-1].salary);	
				System.out.println("-----------------------------------------------------");
				break;
				
			default:
				System.out.println("Wrong input. Try again");
				break;
			}
		}	
	}
}
