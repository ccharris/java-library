package _13_Friends;

public class Friends {

	//properties
	
	String birthday;
	String name;
	String jobTitle;
	String jobCompany;
	String response;
	boolean isFriend;
	boolean isOnline;
	int age;
	int numFriends;
	int lengthOfFriendship;
	String currCity;
	String homeCity;
	String gender;
	
	
	//methods
	public void cityCheck() {
		if (currCity == homeCity) {
			if (gender.equalsIgnoreCase("female")){
				System.out.println(name + " lives in her hometown of " + homeCity + ".");	
			} else if (gender.equalsIgnoreCase("male")){
				System.out.println(name + " lives in his hometown of " + homeCity + ".");
			} else {
				System.out.println(name + " lives in their hometown of " + homeCity + ".");
			}		
		} else {
			if(gender.equalsIgnoreCase("female")){
				System.out.println(name + " has moved away from her hometown of " + homeCity + " to " + currCity + ".");
			} else if(gender.equalsIgnoreCase("male")){
				System.out.println(name + " has moved away from his hometown of " + homeCity + " to " + currCity + ".");
			} else {
				System.out.println(name + " has moved away from their hometown of " + homeCity + " to " + currCity + ".");
					}
			}
		}
	
	
	public void getLength() {
		if(lengthOfFriendship >= 1){
			response = "You have been friends with " + name + " for " + lengthOfFriendship + " years.";
		} else {
			response = "You have not been friends with " + name + " for a year yet.";
		}
		System.out.println(response);
	}
	public void getIsFriend() {
		if (isFriend) {
			System.out.println(name + " is your friend.");
		} else {
			System.out.println(name + " is not your friend, would you like to add them?");
		}
	}
	public void getBirthday() {
		System.out.println( name + "'s birthday is " + birthday);
	}
	
	public void getNumFriends() {
		System.out.println(name + " has " + numFriends + " friends.");
	}
	public void getAge() {
		System.out.println(name + "'s age is " + age + ".");
	}
	
	public void getIsOnline() {
		if (isOnline) {
			System.out.println(name + " is online.");
		} else {
			System.out.println(name + " is not online");
		}
		
	}
	
	
	
	
}
