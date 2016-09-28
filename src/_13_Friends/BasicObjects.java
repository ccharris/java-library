package _13_Friends;

public class BasicObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friends Carolyn = new Friends();
		Carolyn.age = 26;
		Carolyn.isOnline = false;
		Carolyn.numFriends = 300;
		Carolyn.isFriend = true;
		Carolyn.birthday = "March 18th, 1990";
		Carolyn.lengthOfFriendship = 15;
		Carolyn.name = "Carolyn";
		Carolyn.currCity = "Indianapolis";
		Carolyn.homeCity = "West Palm Beach";
		Carolyn.gender = "female";
		
		Carolyn.getIsOnline();
		Carolyn.getAge();
		Carolyn.getNumFriends();
		Carolyn.getIsFriend();
		Carolyn.getBirthday();
		Carolyn.getLength();
		Carolyn.cityCheck();
	}

}
