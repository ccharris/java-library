package _04_Strings.java;

public class _01_Strings {
	public static void main(String[] args) {
		
		String myCats = "My cats are Zelda and Gideon!";
		String myMomsCat = "My mom's cat is Pepper.";
		String allCats = myCats.concat(myMomsCat);
		String allCatsAnd = allCats.concat("Yay!");
		
		System.out.println(myCats);
		System.out.println(allCats);
		System.out.println(allCatsAnd);
		System.out.println(myCats.equals(myMomsCat));
		
		
		
		
		
	}
}
