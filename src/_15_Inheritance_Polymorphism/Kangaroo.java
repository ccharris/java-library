package _15_Inheritance_Polymorphism;

public class Kangaroo extends Animal {
	
	boolean livesInAustralia;
	
	@Override
	public void speak() {
		System.out.println("Hip hop, I'm a kangaroo!!");
	}
	public void sleep() {
		System.out.println("I sleep a normal amount also!");
	}

}

