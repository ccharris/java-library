package movies;

public class Movie {
	
	//properties
	String title;
	String genre;
	String mainActor;
	String mainActress;
	String supportingActor;
	String supportingActress;
	double budget;
	double worldGross;
	double usGross;
	int movieLength;
	String rating;
	double rottenTomatoesPercentage;
	boolean inRedBox;
	
	//Constructor
	Movie(String title, String genre, String mainActress, String mainActor) {
		this.title = title;
		this.genre = genre;
		this.mainActress = mainActress;
		this.mainActor = mainActor;
	}
	
	
	//Methods
	public void getMovieDetails() {
		System.out.println(title + " is a " + genre + " movie starring " + mainActress + " and " + mainActor + ".");
	}
	
}
