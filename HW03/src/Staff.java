// 2021111849 송혜경
public class Staff extends Employee {
	int AnnualSalary;
	
	public int getAnnualSalary() {
		AnnualSalary = getSalary() * 12;
		return AnnualSalary;
	}
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("%10d %16d", getSalary(), getAnnualSalary());
	}
}
