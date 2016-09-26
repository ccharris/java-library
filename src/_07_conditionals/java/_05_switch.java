package _07_conditionals.java;

public class _05_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numPiesEaten = 1;
		String response = "";
		switch(numPiesEaten) {
		case 1: response = "1";
				break;
		case 2: response = "2";
				break;
		case 3: response = "3";
				break;
		case 4: response = "4";
				break;
		case 5: response = "5";
				break;
		}
		System.out.println(response + " pie(s) eaten");
	}

}
