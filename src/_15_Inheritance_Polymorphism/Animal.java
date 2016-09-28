package _15_Inheritance_Polymorphism;

import java.util.Scanner;

public class Animal {
	Scanner scan = new Scanner(System.in);
	//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	public boolean isWarmBlooded;
	public String name;
	public String habitat;
	
	//Methods
	public void printName() {
		System.out.println("My name is " + name);	
	}
	public void askNumTeeth() {
		System.out.println("How many teeth does " + name + " have?");
		int numTeeth = scan.nextInt();
		System.out.println("Great, " + name + " has " + numTeeth + " teeth.");
	}
	public void getBloodType() {
		if (isWarmBlooded) {
			System.out.println(name + " is warm blooded");
		} else {
			System.out.println(name + " is not warm blooded");
		}
	}
	
	public void speak() {
		System.out.println("I am an animal");
	}
	public void sleep() {
		System.out.println("I like sleeping a little bit every day!");
	}
	
	
	
}
