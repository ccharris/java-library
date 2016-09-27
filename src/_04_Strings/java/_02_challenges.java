package _04_Strings.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_challenges {

	public static void main(String[] args) {
		//bronze
//		String firstName = "Carolyn";
//		String middleName = "Calgary";
//		String lastName = "Harris";
//		String fullName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
//		System.out.println(fullName);
//		//silver
//		String sodaCan = "Soda Can";
//		System.out.println(sodaCan.substring(0, 4));
//		System.out.println(sodaCan.substring(5));
//		//gold
//		String sSells = "Sally sells seashells by the seashore";
//		sSells = sSells.toLowerCase();
//		int sCount = 0;
//		for (int i=0; i <sSells.length(); i++) {
//			switch (sSells.charAt(i)){
//			case 's':
//				sCount++;
//				break;
//			default:
//			} 
//		}
//		System.out.println("That string has " + sCount + " s's");
		
		String sallySells = "Sally sells seashells by the seashore";
		int vowelCount = 0;
		for (int i =0; i <sallySells.length(); i++) {
			if (Character.toString(sallySells.charAt(i)).matches("[sS]")) {
				vowelCount++;
			
			}
		}
		System.out.println("There are " + vowelCount + " s's.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter some text to search for vowels: ");
//		String userInput = sc.nextLine();
//		sc.close();
//		int numOfVowels = 0;
//		for (int i = 0; i <= userInput.length() - 1; i++) {
//			if (Character.toString(userInput.charAt(i)).matches("[aeiouAEIOU]")) {
//				numOfVowels++;
//			}
//		}
//		System.out.println("There are " + numOfVowels + " vowels.");
		
		
	}

}
