package movies;

public class MoviesObjects {

	public static void main(String[] args) {
		
		Movie starTrek = new Movie("Star Trek", "Sci-fi", "Zoe Saldana", "Chris Pine");
		Movie starWarsNew = new Movie("Star Wars: the Force Awakens", "Sci-Fi", "Daisy Ridley", "Harrison Ford");
		starTrek.getMovieDetails();
		starWarsNew.getMovieDetails();
	}

}
