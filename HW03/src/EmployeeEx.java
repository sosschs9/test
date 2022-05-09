// 2021111849 송혜경
import java.util.Scanner;

public class EmployeeEx {
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
		staffs[2].setPosition("Office manager");
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
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Staff[] staffs = new Staff[3];
		Engineer[] engineers = new Engineer[3];
		
		for(int i = 0; i < staffs.length; i++) {
			staffs[i] = new Staff();
		}
		for(int i = 0; i < engineers.length; i++) {
			engineers[i] = new Engineer();
		}
		
		setdata(staffs, engineers);
		
		while(true) {
			System.out.println("========================================================");
			System.out.println("1. Display all employees' information (Staff, Engineer)");
			System.out.println("2. Display all staffs' information");
			System.out.println("3. Display all engineers' information");
			System.out.println("4. Display all employees' name, salary, annual salary");
			System.out.println("5. Display all employees' name, position");
			System.out.println("6. Display statistics of annual salary");
			System.out.println("0. Quit");
			System.out.println("========================================================");
			System.out.print("-> ");
			
			switch(scan.nextInt()) {
			case 0:
				System.out.println("Bye!");
				System.exit(0);
				break;
			case 1:
				System.out.println("[Staff]");
				System.out.println("           Name   Age       Position     Salary    Annual Salary");
				System.out.println("--------------------------------------------------------------------");
				for(int i = 0; i < staffs.length; i++) {
					staffs[i].printEmployee();
					System.out.print("\n");
				}
				System.out.println("[Engineer]");
				System.out.println("           Name   Age       Position  Overworking Pay     Salary     Annual Salary");
				System.out.println("-----------------------------------------------------------------------------------");
				for(int i = 0; i < engineers.length; i++) {
					engineers[i].printEmployee();
					System.out.print("\n");
				}
				break;
			case 2:
				System.out.println("[Staff]");
				System.out.println("           Name   Age       Position     Salary    Annual Salary");
				System.out.println("--------------------------------------------------------------------");
				for(int i = 0; i < staffs.length; i++) {
					staffs[i].printEmployee();
					System.out.print("\n");
				}
				break;
			case 3:
				System.out.println("[Engineer]");
				System.out.println("           Name   Age       Position  Overworking Pay     Salary     Annual Salary");
				System.out.println("-----------------------------------------------------------------------------------");
				for(int i = 0; i < engineers.length; i++) {
					engineers[i].printEmployee();
					System.out.print("\n");
				}
				break;
			case 4:
				System.out.println("[Staff]");
				System.out.println("           Name     Salary    Yearly Salary");
				System.out.println("----------------------------------------------------");
				for(int i = 0; i < staffs.length; i++) {
					System.out.printf("%15s %8d %14d", staffs[i].getName(), staffs[i].getSalary(), staffs[i].getAnnualSalary());
					System.out.print("\n");
				}
				System.out.println("\n[Engineer]");
				System.out.println("           Name     Salary    Yearly Salary");
				System.out.println("----------------------------------------------------");
				for(int i = 0; i < engineers.length; i++) {
					System.out.printf("%15s %8d %14d", engineers[i].getName(), engineers[i].getSalary(), engineers[i].getAnnualSalary());
					System.out.print("\n");
				}
				break;
			case 5:
				System.out.println("[Staff]");
				System.out.println("           Name           Position");
				System.out.println("----------------------------------------------------");
				for(int i = 0; i < staffs.length; i++) {
					System.out.printf("%15s %18s", staffs[i].getName(), staffs[i].getPosition());
					System.out.print("\n");
				}
				System.out.println("\n[Engineer]");
				System.out.println("           Name           Position");
				System.out.println("----------------------------------------------------");
				for(int i = 0; i < engineers.length; i++) {
					System.out.printf("%15s %18s", engineers[i].getName(), engineers[i].getPosition());					
					System.out.print("\n");
				}
				break;
			case 6:
				int[] statistics = new int[10];
				for(int i = 0; i < staffs.length; i++) {
					statistics[staffs[i].getAnnualSalary() / 1000]++;
				}
				for(int i = 0; i < engineers.length; i++) {
					statistics[engineers[i].getAnnualSalary() / 1000]++;
				}
				
				for(int i = 0; i < statistics.length; i++) {
					System.out.print("[" + i + "000]: ");
					for(int j = 0; j < statistics[i]; j++) {
						System.out.print("#");
					}
					System.out.print("\n");
				}
				break;
			default:
				System.out.println("Wrong input. Try again!");
				break;
			}
		}
		
	}
}
