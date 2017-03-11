
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
	private String movieDate;
	private String movieTime;
	private String theaters;
	private int availableTickets;
	private String moviePicture;

	/*
	 * Initialize the movie object
	 */
	public Movie(String moviePicture,String movieName, double moviePrice, String ageRestrictions, String movieDate, String movieTime, String theaters,int availableTickets) {
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.ageRestrictions = ageRestrictions;
		this.movieDate = movieDate;
		this.movieTime = movieTime;
		this.availableTickets = availableTickets;
		this.theaters = theaters;
		this.moviePicture = moviePicture;
		
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

	/**
	 * @return the moviePreview
	 */
	public String getMoviePreview() {
		return movieDate;
	}	

	public String getTheaters() {
		return theaters;
	}	

	public int getAvailableTickets() {
		return availableTickets;
	}

	public String getMovieTime() {
		return movieTime;
	}

	/**
	 * @return the moviePicture
	 */
	public String getMoviePicture() {
		return moviePicture;
	}
	
}
