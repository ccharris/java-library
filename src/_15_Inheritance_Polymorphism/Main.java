package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal george = new Animal();
		george.name = "George the Animal";
		
		Bear barney = new Bear();
		barney.name = "Barney";
		barney.isHibernating = true;

		Kangaroo kangy = new Kangaroo();
		kangy.livesInAustralia = true;
		kangy.isWarmBlooded = true;
		kangy.name = "Jack";
		
		Mouse littleMouse = new Mouse();
		
		barney.printName();
		kangy.printName();
		george.printName();
//		kangy.askNumTeeth();
		kangy.getBloodType();
		
		
		barney.speak();
		kangy.speak();
		littleMouse.speak();
		littleMouse.sleep();
		kangy.sleep();
		george.sleep();
		barney.sleep();
		
	}

}
