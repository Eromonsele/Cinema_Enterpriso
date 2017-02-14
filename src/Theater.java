
//import statements
import java.util.ArrayList;

/*
 * Theater.java
 * 
 * The theater class contains the theater objects and its attributes such as theater name,
 * number of seats in the theater and the movie previewing at the theater. Here we add movies to 
 * be shown at the theater at a certain date and time 
 * 
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class Theater {

	Movie movie;
	private String theaterName;
	private int seatsInTheTheater;
	private ArrayList<Movie> movieCatalog;

	public Theater(String theaterName, int seatsInTheTheater) {
		this.theaterName = theaterName;
		this.seatsInTheTheater = seatsInTheTheater;
		movieCatalog = new ArrayList<Movie>();
	}

	/*
	 * Adds a movie to the movie catalog. The movie argument must specify the
	 * movie name, the movie price and the movie age restrictions.
	 * 
	 * @param movie the movie object
	 */
	public void addMovie(Movie movie) {
		movieCatalog.add(movie);
	}

	/**
	 * Gets the name of the theater
	 * 
	 * @return the theaterName
	 */
	public String getTheaterName() {
		return theaterName;
	}

	/**
	 * Gets the number of seats in the theater
	 * 
	 * @return the seatsInTheTheater
	 */
	public int getSeatsInTheTheater() {
		return seatsInTheTheater;
	}

	/**
	 * Gets the list of movies to be shown at the theater
	 * 
	 * @return the movieCatalog
	 */
	public ArrayList<Movie> getMovieCatalog() {
		return movieCatalog;
	}

	// Take this out
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Theater name: " + getTheaterName() + "\nSeats in the Theater: " + getSeatsInTheTheater()
				+ "\nMovies Showing in the theater\n\nMovies to be Shown:\n " + getMovieCatalog());
	}
}
