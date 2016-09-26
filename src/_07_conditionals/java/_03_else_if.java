package _07_conditionals.java;

import java.util.Scanner;

public class _03_else_if {

	public static void main(String[] args) {
//		// Bronze
//		Boolean cat = true;
//		String catName = "Gideon";
//		
//		Boolean byMe = true;
//		if (cat && catName.equals("Gideon") && byMe){
//			System.out.println("Gideon is by me!!");
//		} else if (cat && !catName.equals("Gideon") && byMe){
//			System.out.println("Hello strange cat!");
//		} else if (cat && !byMe) {
//			System.out.println("I wish that cat was near me!");
//		} else {
//			System.out.println("Where are the cats?!");
//		}
		// Silver
//		if (cat && catName.equals("Gideon") || cat && catName.equals("Zelda")){
//			System.out.println("Hi baby!");
//		}
		//Gold 
//		Write an else if that allows users to use the Scanner app for assessing grades. The user should be able to enter
//		their percentage and get back their letter grade.  It should look like this:
//			Enter your percentage:
//			Your letter grade is: 
		Scanner scan = new Scanner(System.in);
	 		System.out.println("Please enter your percentage:");
	 		int percent = scan.nextInt();
	 		
	 		if(percent >= 90){
	 			System.out.println("Congrats, you have an A!");
	 		} else if (percent >= 80){
	 			System.out.println("You received a B.");
	 		} else if (percent >= 70){
	 			System.out.println("You received a C.");
	 		} else if (percent >= 60){
	 			System.out.println("You received a D.");
	 		} else {
	 			System.out.println("You failed.");
	 		}
	 		
	 	
		
		

	}

}
