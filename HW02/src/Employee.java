// 2021111849 송혜경
public class Employee {
	int age;
	String position;
	String fullName;
	int salary;
	
	public void setAge(int age) {
		this.age = age;
	}	
	public void setPosition(String position) {
		this.position = position;
	}
	public void setName(String firstname, String lastname) {
		this.fullName = firstname + " " + lastname;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return fullName;
	}
	public int getSalary() {
		return salary;
	}
	public String getPosition() {
		return position;
	}
	public int getAge() {
		return age;
	}
	public void printEmployeeInfo() {
		System.out.printf(" %15s %5d %30s %12d\n", fullName, age, position, salary);
	}
}
