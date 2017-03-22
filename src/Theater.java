
//import statements
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Stores details
 * 
 * @author Eromonsele Okhilua
 * @version 1.0.2 *
 */
public class Theater {
	// The theater's name.
	private String theaterName;
	// The number of seats at this theater.
	private int theaterSeats;
	// A list
	private ArrayList<Movie> moviesList;

	/**
	 * Construct for objects of class theater.
	 * 
	 * @param theaterName
	 *            The theater's name.
	 * @param theaterSeats
	 *            The number of seats at the theater.
	 */
	public Theater(String theaterName, int theaterSeats) {
		this.theaterName = theaterName;
		this.theaterSeats = theaterSeats;
		moviesList = new ArrayList<Movie>();
	}

	/**
	 * Return the list of movies.
	 * 
	 * @return the moviesList.
	 */
	public ArrayList<Movie> getMoviesList() {
		return moviesList;
	}

	/**
	 * Return the theater's name.
	 * 
	 * @return the theaterName.
	 */
	public String getTheaterName() {
		return theaterName;
	}

	/**
	 * Return the theater's seat.
	 * 
	 * @return the theaterSeats.
	 */
	public int getTheaterSeats() {
		return theaterSeats;
	}

	/**
	 * 
	 */
	public void addMovies() {

		try {
			String line = null;
			Scanner input = new Scanner(new File("fileMovie.txt"));

			while (input.hasNextLine()) {
				if ((line = input.nextLine()) != null) {
					String[] word = line.split(";");
					String mN = word[0];
					float mP = Float.parseFloat(word[1]);
					String aR = word[2];
					String mD = word[3];
					String mT = word[4];
					String moviePic = word[5];
					int aT = theaterSeats;

					getMoviesList().add(new Movie(moviePic, mN, mP, aR, mD, mT, aT));

				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
