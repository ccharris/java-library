package _14_Constructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {
		Employee paul = new Employee("Paul", 100000.00, 2015, 1970);
		System.out.println(paul.name + " makes $" + paul.salary);

	}

}
