package _14_Constructor_Employee;

public class Cashier extends Employee{
	String shiftTime;
	Cashier(String name, double salary, int startYear, int birthYear, String shiftTime) {
		super(name, salary, startYear, birthYear);
		this.shiftTime = shiftTime;
	}

	@Override
	public void employmentDetails(){
	System.out.println(name + " makes $" + salary + " and started in " + startYear + " and was born in " + birthYear + " and was hired for the " + shiftTime + " shift.");

	}
}