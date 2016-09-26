package _06_inputoutput.java;

import java.util.Scanner;

public class _01_user_input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		System.out.println(userInput);
		
		System.out.println("Input the first number to add!");
		int num1 = scan.nextInt();
		System.out.println("Input the second number!");
		double num2 = scan.nextDouble();
		double num3 = num1 + num2;
		System.out.println("Your total is: " + num3);
	}

}