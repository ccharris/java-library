package _09_loops.java;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_for {

	public static void main(String[] args) {
//		//TODO: If you've never done for loops, you will need a lot of practice. We recommend you study these
//		until you can do one without looking. Take a break, and then do some more.	    	
////		
//		for (int j = 10; j>0; j--){
//			System.out.println("The value of j is: " + j + "\n");
//		}
//		
//		
////		// Bronze: 
////			Create a loop that counts from 0 to 10 and prints even for even numbers
//		for (int k = 0; k<=10; k++){
//			if (k%2 == 0){
//			System.out.println("The value of the even number is: " + k);
//			} else {
//				System.out.println("The value of the odd number is: " + k);
//			}
//		}
////		// Silver: 
////			Create a for loop that counts the amount of vowels in a string
//		String vowels = "Aloha kiddee".toLowerCase();
//		int vowelCount = 0;
//		for (int i = 0; i<vowels.length(); i++){
//			switch(vowels.charAt(i)) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				vowelCount++;
//				break;
//			default:
//			}
//			
//		}
//		System.out.println("The string has " + vowelCount + " vowels.");
//		// Gold: 
//			Create a for loop that counts the amount of vowels in a string given by a user req. input.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please type the phrase you would like to count the vowels in");
//		String vowelString = scan.nextLine();
//		vowelString = vowelString.toLowerCase();
//		int vowelsCount = 0;
//		for (int m = 0; m<vowelString.length(); m++){
//			switch(vowelString.charAt(m)) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				vowelsCount++;
//				break;
//			default:
//			}
//			
//		}
//		System.out.println("The string has " + vowelsCount + " vowels.");
//		double balance = 5000;
//		double rate = 1.02; 
//		for(int i=0; i<=10; i++){
//			balance *= rate;
//			System.out.println(balance);
//		}
		String spaces = "there are some spaces in this string";
		int spaceCount = 0;
		for(int i = 0; i < spaces.length(); i++)
		{
		if (Character.toString(spaces.charAt(i)).matches("[ ]")) 
		{
			spaceCount++;
		}
		}
		System.out.println(spaceCount);
		
		String[] comedians = { "Bill Hader", "Dane Cook", "George Carlin", "Louis CK"};
		for(String comedian : comedians){
			System.out.println(comedian);
		}
		
		String[] greatestBossesOfAllTime = {"Jenn Aikins", "Bob Alcorn", "Robin Holer", "Aaron"};
		for(String boss : greatestBossesOfAllTime){
			System.out.println(boss);
		}
		
		String s = "hello";
		for(char ch : s.toCharArray()){
			System.out.println(ch);
		}
	}

}
