
//import statements
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Movie.java
 * 
 * Movie Class, This class contains a movie object, an its attributes such as the movie name,
 * movie price, movie age restrictions, and times the movie will be previewing
 * 
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class Movie {

	private String movieName;
	private double moviePrice;
	private String ageRestrictions;
	private HashMap<String, ArrayList<String>> movieDate;

	/*
	 * Initialize the movie object
	 */
	public Movie(String movieName, double moviePrice, String ageRestrictions) {
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.ageRestrictions = ageRestrictions;
		setMoviePreview(new HashMap<>());
	}

	/**
	 * Gets the price for the movie
	 * 
	 * @return the moviePrice
	 */
	public double getMoviePrice() {
		return moviePrice;
	}

	/**
	 * Gets the name of the movie
	 * 
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * Gets the age restrictions of the movie
	 * 
	 * @return the ageRestrictionss
	 */
	public String getAgeRestrictions() {
		return ageRestrictions;
	}

	@Override
	public String toString() {
		return ("Movie name: " + getMovieName() + "\nPrice: " + getMoviePrice() + "\nAge Restrictions: "
				+ getAgeRestrictions() + "\nMovie Times: " + getMoviePreview() + "\n");
	}

	/**
	 * @return the moviePreview
	 */
	public HashMap<String, ArrayList<String>> getMoviePreview() {
		return movieDate;
	}

	/**
	 * @param moviePreview
	 *            the moviePreview to set
	 */
	public void setMoviePreview(HashMap<String, ArrayList<String>> moviePreview) {
		this.movieDate = moviePreview;
	}
}
