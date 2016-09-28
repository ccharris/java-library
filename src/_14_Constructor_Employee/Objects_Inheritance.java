package _14_Constructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {
		
		Cashier james = new Cashier("James", 25000.00, 2016, 1975, "night");
		Employee paul = new Employee("Paul", 150000.00, 2015, 1975);
		Manager carolyn = new Manager("Carolyn", 1000000.00, 2016, 1990, "Mobile Development");	
		Team_Leader summer = new Team_Leader("Summer", 500000.00, 2016, 1998, "Java");
	
		james.employmentDetails();
		paul.employmentDetails();
		summer.employmentDetails();
		carolyn.employmentDetails();
		
	}

}
