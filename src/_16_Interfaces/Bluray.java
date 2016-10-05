package _16_Interfaces;

public class Bluray implements IFunctions {

	@Override
	public void play() {
		System.out.println("Now playing the Bluray");
		
	}

	@Override
	public void stop() {
		System.out.println("Now stopping the Bluray");
		
	}

	@Override
	public void skip() {
		System.out.println("Skip to next chapter in the bluray");
		
	}

	@Override
	public void menu() {
		System.out.println("Go to Bluray menu");
		
	}

	@Override
	public void pause() {
		System.out.println("Pausing the bluray");
		
	}
	public void beHighDef(boolean isHighDef){
		if(isHighDef){
			System.out.println("I am a high def bluray!");
		} else {
			System.out.println("I am not a high def bluray.");
		}
	}

	@Override
	public void getTitle(String title) {
		System.out.println("This bluray's title is " + title);		
	}

}
