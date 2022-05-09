// 2021111849 송혜경
public class Engineer extends Employee {
	private int day;
	
	public void setOverworkingDay(int day) {
		this.day = day;	
	}
	public int getOverworkingPay() {
		return 3 * this.day;
	}
	public int getAnnualSalary() {
		return (getSalary() + getOverworkingPay()) * 12;
	}
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("%16d %10d %17d", getOverworkingPay(), getSalary(), getAnnualSalary());
	}
}
