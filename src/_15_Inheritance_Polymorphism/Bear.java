package _15_Inheritance_Polymorphism;

public class Bear extends Animal{

	public boolean isHibernating;
	
	@Override 
	public void speak() {
		System.out.println("ROOOOOOOOOOAAAAAAAARRRR!");
	}
	public void sleep() {
		System.out.println("I loooove sleep and love to hibernate!!!");
	}
}
