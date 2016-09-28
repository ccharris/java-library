package _14_Constructor_Employee;

public class Manager extends Employee {

	public String department;
	
	Manager(String name, double salary, int startYear, int birthYear, String department) {
		super(name, salary, startYear, birthYear);
		this.department = department;
	}
	@Override
	public void employmentDetails(){
		System.out.println(name + " makes $" + salary + " and started in " + startYear + " and was born in " + birthYear + " and was hired for the " + department + " department.");
	}
	
}
