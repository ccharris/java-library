package _07_conditionals.java;

import java.util.Scanner;

public class _02_if_else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//BRONZE
//		int age = 22;
//		boolean inAmerica = false;
//		String wantsDrink = "no";
//		if (age >= 21 && wantsDrink.contains("y")){
//			System.out.println("You can have a drink, then!");
//			
//		} else if (age >= 21 && !wantsDrink.contains("y")){
//			System.out.println("If you don't want a drink why are you asking!");
//		} else if (!inAmerica && wantsDrink.contains("y")){
//			System.out.println("Go nuts outside of America!");
//		} else {
//			System.out.println("Gotta be 21 in America baby.");
//		}
		//SILVER
		String password = "PassWord12";
		System.out.println("Please enter your password:");
		String enteredPassword = scan.nextLine();
		if(password.equals(enteredPassword)){
			System.out.println("Thank you for the correct password.");
		} else{
			System.out.println("Incorrect password.");
		}
		
		
		
		//GOLD
//		System.out.println("Enter your hourly pay:");
//		String hourlyPay = scan.nextLine();
//		System.out.println("Enter the number of hours you worked:");
//		String hoursWorked = scan.nextLine();
//		double doubleHourlyPay = Double.parseDouble(hourlyPay);
//		double doubleHoursWorked = Double.parseDouble(hoursWorked);
//		double moneyMade = doubleHourlyPay * doubleHoursWorked;
//		System.out.println("You will earn $" + moneyMade + " on your paycheck.");
		
	}

}
