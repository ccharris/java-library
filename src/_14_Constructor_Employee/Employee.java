package _14_Constructor_Employee;

public class Employee {
	//properties
	public String name;
	double salary;
	int startYear;
	int birthYear;
	
	//constructor
	//A constructor is a method that has the same name as the Class itself - it builds
	//our instances or objects of that class type
	Employee(String name, double salary, int startYear, int birthYear) {
		this.name = name;
		this.salary = salary;
		this.startYear = startYear;
		this.birthYear = birthYear;
	}
	
	
	
	
}
