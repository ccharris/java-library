package _02_Hello_World;

import _17_Encapsulation.ColtsPlayers;

public class HelloWorld {
	public static void main(String[] args) 

	{
//		System.out.println("Hello World");
//		System.out.print("Hello World Again");
		
		ColtsPlayers aCastonzo = new ColtsPlayers();
		aCastonzo.name = "Anthony Castonzo";
		aCastonzo.setNumber(74);
		aCastonzo.getNumber();
		
		System.out.println(aCastonzo.name + " is number " + aCastonzo.getNumber());
	}
}
