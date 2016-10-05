package _16_Interfaces;

public class DVD implements IFunctions {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now playing");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now stopped");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skip to next chapter");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("Go to DVD Menu");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now paused");
	}
	public void beCheaperThanBr() {
		System.out.println("I am cheaper than a bluray!");
	}

	@Override
	public void getTitle(String title) {
		System.out.println("This DVD's title is "+ title);
		
	}

}
