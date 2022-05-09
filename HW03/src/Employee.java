// 2021111849 송혜경
public class Employee {
	private int age;
	private String position;
	private String name;
	private int salary;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setName(String firstname, String lastname) {
		this.name = firstname +" "+ lastname;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void printEmployee() {
		System.out.printf("%15s %4d %15s ", this.name, this.age, this.position);
	}
	public String getName() {
		return this.name;
	}
	public int getSalary() {
		return this.salary;
	}
	public String getPosition() {
		return this.position;
	}
	public int getAge() {
		return this.age;
	}
}
