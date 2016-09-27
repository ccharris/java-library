package _11_Codewars.java;

public class _01_challenges {

	  public int squareDigits(int n) {
		    String strNum = "" + n;
		    int strLength = strNum.length();
		    String newNum = "";
		    for (int i = 0; i < strLength; ++i) {
		    char digit = (strNum.charAt(i));
		    int realDigit = Integer.parseInt(String.valueOf(digit));
		    newNum += (realDigit * realDigit);
		}
		   return Integer.parseInt(newNum);
		  }
	}


