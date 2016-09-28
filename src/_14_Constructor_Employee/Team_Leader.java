package _14_Constructor_Employee;

public class Team_Leader extends Employee {
	String teamName;
	Team_Leader(String name, double salary, int startYear, int birthYear, String teamName) {
		super(name, salary, startYear, birthYear);
		this.teamName = teamName;
	}
	
	@Override
	public void employmentDetails(){
		System.out.println(name + " makes $" + salary + " and started in " + startYear + " and was born in " + birthYear + " and was hired for the " + teamName + " team.");
	}
}
