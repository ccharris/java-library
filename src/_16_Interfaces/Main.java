package _16_Interfaces;

public class Main {

	public static void main(String[] args) {
		DVD newDVD = new DVD();
		CD newCD = new CD();
		Bluray newBr = new Bluray();
		
		
		newCD.play();
		newCD.skip();
		newCD.menu();
		newCD.stop();
		newCD.getTitle("Good Charlotte");
		newCD.turnUpToEleven(11);
		newDVD.play();
		newDVD.menu();
		newDVD.skip();
		newDVD.stop();
		newDVD.beCheaperThanBr();
		newDVD.getTitle("Ever After");
		newBr.stop();
		newBr.play();
		newBr.menu();
		newBr.skip();
		newBr.beHighDef(true);
		newBr.getTitle("Star Trek");

	}

}
