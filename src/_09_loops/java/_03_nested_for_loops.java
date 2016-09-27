package _09_loops.java;

public class _03_nested_for_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numArray = {1,2,3,4,5,6,7,8,9};
		int total = 0;
		for (int i = 0; i<numArray.length; i++){
			for (int j = 1; j <= i+1; j++){
				if (j<numArray.length){
				total += (numArray[i] + numArray[j]);
				}
			}
			
		}
		System.out.println(total);
		
		
	}

}
