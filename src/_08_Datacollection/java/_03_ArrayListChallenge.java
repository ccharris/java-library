package _08_Datacollection.java;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_ArrayListChallenge {

	public static void main(String[] args) {
		// BRONZE CHALLENGE: After adding numbers 1 - 10 to an array list, print out the size of the list
//		ArrayList<Integer> numTen = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		int listSize = numTen.size();
//		System.out.println(listSize);
//		
//		// BRONZE CHALLENGE II:  Add numbers 1 - 10 to an array list, Print out the first and last element in an array, using the ArrayList positions.
//		System.out.println(numTen.get(0));
//		System.out.println(numTen.get(9));
//		// SILVER CHALLENGE: Add the numbers in the array list together and place that into a variable
//		int addedTogether = 0;
//		for (int i=0; i < numTen.size(); i++){
//			addedTogether = addedTogether + numTen.get(i);
//		}
//		System.out.println(addedTogether);
//	
//		GOLD CHALLENGE: 
//		1) Add numbers in array 1 - 10.
//		2) Print out the array 
//		3) Print out the total of the array 
//		4) Print out the equation the for loop goes through to add each element together
//
//		i.e this should be your output:
//		0 + 1 = 1
//		1 + 2 = 3
//		3 + 3 = 6
//		6 + 4 = 10
//		10 + 5 = 15
//		15 + 6 = 21
//		21 + 7 = 28
//		28 + 8 = 36
//		36 + 9 = 45
//		45 + 10 = 55
		int[] theArray = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < theArray.length; i++) {
			System.out.println(theArray[i]+ " ");
		}
		int total = 0;
		for (int j = 0; j < theArray.length; j++) {
			System.out.println(total + " + " + theArray[j] + " = " + (total + theArray[j] ) );
			total += theArray[j];
		}
		
		 
	}

}
