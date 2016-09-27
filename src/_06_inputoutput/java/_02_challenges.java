package _06_inputoutput.java;

import java.util.Scanner;


public class _02_challenges {

	public static void main(String[] args) {
		// BRONZE
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Please enter your name");
//		String userName = scan.nextLine();
//		System.out.println("Please enter your address:");
//		String userAddress = scan.nextLine();
//		System.out.println("Please enter your date of birth");
//		String userBirth = scan.nextLine();
//		System.out.println(userName + " " + userAddress + " " + userBirth);

//		//SILVER
//		System.out.println("What is the main character of your story's name?");
//		String mainCharacter = scan.nextLine();
//		System.out.println("How much money does " + mainCharacter + " have?");
//		String totalMoney = scan.nextLine();
//		double doubleTotalMoney = Double.parseDouble(totalMoney);
//		System.out.println("Is " + mainCharacter + " going to go shopping?");
//		String isShopping = scan.nextLine();
//		System.out.println(isShopping);
//		
//		if(isShopping.equals("yes") || isShopping.equals("Yes")){
//			System.out.println("How much money is " + mainCharacter + " going to spend?");
//			String moneySpent = scan.nextLine();
//			double doubleMoneySpent = Double.parseDouble(moneySpent);
//			if(doubleMoneySpent <= doubleTotalMoney){
//			doubleTotalMoney = doubleTotalMoney - doubleMoneySpent;
//					System.out.println(mainCharacter + " now has $" + doubleTotalMoney + ".");
//			} else {
//				System.out.println(mainCharacter + " does not have enough money for that!");
//			}
//		} else {
//			System.out.println(mainCharacter + " is saving money!");
//		}
		//GOLD
		
		System.out.println("You see a small, seemingly less traveled path, off the road you often take, do you go down the path?");
		String pathStart = scan.nextLine();
		if(pathStart.contains("y")){
			System.out.println("You excidedly leap onto this path,excited for the adventure ahead!");
			System.out.println("You are walking along quickly, when you hear a loud bang to your left, do you investigate?");
			String bangStart = scan.nextLine();
			if(bangStart.contains("y")){
				System.out.println("You turn left, moving slowly, your heartbeat picking up..");
				System.out.println("The light is low in here, the trees thick overhead, you can't see well, so you pull out your flashlight from your phone");
				System.out.println("All of a sudden you see a pair of reflective eyes on the path ahead, and see a shadow move quickly. You're startled. Should you turn back?");
				String startleStart = scan.nextLine();
				if(startleStart.contains("n")){
					System.out.println("Nothing is going to scare you off today! You're sure it was just a small animal, maybe a cat.");
					System.out.println("You follow the path as it gets smaller through the woods, when you see a strange light filtering down through the forest.");
					System.out.println("Do you go closer to the light?");
					String lightStart = scan.nextLine();
					if(lightStart.contains("y")){
						System.out.println("You inch forward towards the light, your heart hammering quickly in your chest, you notice the forest around you is still, and you hear nothing.");
						System.out.println("You notice the light is making an odd noise, weirdly high pitched. Do you want to touch it?");
						String touchLight = scan.nextLine();
						if(touchLight.contains("y")){
							System.out.println("You reach your hand out and feel intense heat as you get closer to the light.");
							System.out.println("Do you still want to touch it?");
							String reallyTouch = scan.nextLine();
							if (reallyTouch.contains("y")){
								System.out.println("As your hand makes connection, electricity surges through you, and you die");
							}else {
								System.out.println("You pull your hand back slowly, sighing in disappointment, but content that you made the right decision. You turn on your heel, and enjoy a weird light-free rest of your journey through the forest.");
							}
						}else {
							System.out.println("You back away slowly, and have a pleasant rest of the journey through the forest, definitely not thinking about the weird light");
						}
					}else{
						System.out.println("You've had enough of this spooky place, and turn quickly and run away.");
					}
					
				} else{
					System.out.println("You run the other direction quickly, determined not to get eaten. Unfortunately for you, you fall in a hole, break your leg, and die of an infection before you can reach civilization.");
				}
			}else{
				System.out.println("You shake your head, no way are you going down there, you stay to the right away from the loud noise.");
				System.out.println("As you follow the right path, you see many cute animals, and pretty birds and have an enjoyable walk through the woods.");
			}
			
			
		} else {
			System.out.println("Next time, be more adventurous!!");
		}
	}

}
