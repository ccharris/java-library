package _15_Inheritance_Polymorphism;

public class Mouse extends Animal {

	@Override
	public void speak() {
		System.out.println("Squeak, squeak, squeak!!");
	}
	public void sleep() {
		System.out.println("I don't sleep a lot, I'm a mouse!");
	}
}
