package _09_loops.java;

import java.util.ArrayList;

public class _01_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = 0;
		
//		while( num1 < 11) {
//			System.out.println("value of x: " + num1);
//			num1++;
//			System.out.print("\n");
//		}
//		BRONZE:
//		    //Use a while loop to count backwards
		int numTwo = 10;
			while( numTwo >= 0){
			System.out.println("You have " + numTwo + " seconds remaining.");
			numTwo--;
			System.out.print("\n");
			}
		
//		SILVER:
//			//Use a while loop that lists out each letter of your name.
			int count = 0;
			String nameString = "CAROLYN";
			while (count < nameString.length() ) {
				System.out.println(nameString.charAt(count));
				count++;
				
			}
//			GOLD:
//			/Create a while loop that prints your name backwards.
		
			String name = "CAROLYN";
			int length = name.length();
			String reverse = "";
			int i = length - 1;
			while (i >= 0 ) {
				reverse = reverse + name.charAt(i);
				i --;
				
			}
			System.out.println(reverse);
			
			

			}


	}


