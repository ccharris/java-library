package _06_inputoutput.java;

import java.util.Scanner;

public class _02_challenges {

	public static void main(String[] args) {
		// BRONZE
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Please enter your name");
//		String userName = scan.nextLine();
//		System.out.println("Please enter your address:");
//		String userAddress = scan.nextLine();
//		System.out.println("Please enter your date of birth");
//		String userBirth = scan.nextLine();
//		System.out.println(userName + " " + userAddress + " " + userBirth);

		//SILVER
		System.out.println("What is the main character of your story's name?");
		String mainCharacter = scan.nextLine();
		System.out.println("How much money does " + mainCharacter + " have?");
		String totalMoney = scan.nextLine();
		double doubleTotalMoney = Double.parseDouble(totalMoney);
		System.out.println("Is " + mainCharacter + " going to go shopping?");
		String isShopping = scan.nextLine();
		System.out.println(isShopping);
		
		if(isShopping.equals("yes") || isShopping.equals("Yes")){
			System.out.println("How much money is " + mainCharacter + " going to spend?");
			String moneySpent = scan.nextLine();
			double doubleMoneySpent = Double.parseDouble(moneySpent);
			if(doubleMoneySpent <= doubleTotalMoney){
			doubleTotalMoney = doubleTotalMoney - doubleMoneySpent;
					System.out.println(mainCharacter + " now has $" + doubleTotalMoney + ".");
			} else {
				System.out.println(mainCharacter + " does not have enough money for that!");
			}
		} else {
			System.out.println(mainCharacter + " is saving money!");
		}
	}

}
