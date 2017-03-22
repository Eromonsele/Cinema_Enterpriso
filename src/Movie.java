
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
	private float moviePrice;
	private String ageRestrictions;
	private String movieDate;
	private String movieTime;
	private int availableTickets;
	private String moviePicture;

	/**
	 * Constructor for objects of class Movie.
	 * 
	 * @param moviePicture
	 *            The movie's poster.
	 * @param movieName
	 *            The movie's name.
	 * @param moviePrice
	 *            The movie's price.
	 * @param ageRestrictions
	 *            The movie's film rating.
	 * @param movieDate
	 *            The movie's viewing date.
	 * @param movieTime
	 *            The movies's viewing time.
	 * @param availableTickets
	 */
	public Movie(String moviePicture, String movieName, float moviePrice, String ageRestrictions, String movieDate,
			String movieTime, int availableTickets) {
		this.movieName = movieName;
		this.moviePrice = moviePrice;
		this.ageRestrictions = ageRestrictions;
		this.movieDate = movieDate;
		this.movieTime = movieTime;
		this.availableTickets = availableTickets;
		this.moviePicture = moviePicture;

	}

	/**
	 * Return the price for the movie
	 * 
	 * @return the moviePrice
	 */
	public float getMoviePrice() {
		return moviePrice;
	}

	/**
	 * Return the name of the movie
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

	/**
	 * @return
	 */
	public int getAvailableTickets() {
		return availableTickets;
	}

	/**
	 * @return
	 */
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
