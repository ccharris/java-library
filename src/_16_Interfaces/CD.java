package _16_Interfaces;

public class CD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("CD is now playing");
		
	}

	@Override
	public void stop() {
		System.out.println("CD is stopped");
		
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next song");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Go to CD Menu");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pause song");
		
	}
	public void turnUpToEleven(int number){
		if (number == 11){
			System.out.println("Yeah it's at " + number + "!!!" );
		} else {
			System.out.println("Turn it up to 11!");
		}
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("This CD's name is " + title);
	}
	
	
}
