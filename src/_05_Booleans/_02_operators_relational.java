package _05_Booleans;

public class _02_operators_relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bankAccount = 9000;
		boolean accountHigher = bankAccount >= 10000;
		if (accountHigher){
		System.out.println("You have at least 10,000 dollars.");
	}
		boolean accountLower = bankAccount < 10000;
		if (accountLower){
			System.out.println("You do not have at least 10,000 dollars.");
		}
	}

}
