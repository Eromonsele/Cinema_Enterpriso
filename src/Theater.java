
//import statements
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * @author Eromonsele Okhilua
 * @version	1.0.2 * 
 */
public class Theater {
	private String theaterName;
	private int theaterSeats;
	private ArrayList<Movie> moviesList;

	public Theater(String theaterName, int theaterSeats) {
		this.theaterName = theaterName;
		this.theaterSeats = theaterSeats;
		moviesList = new ArrayList<Movie>();
	}

	/**
	 * @return the moviesList
	 */
	public ArrayList<Movie> getMoviesList() {
		return moviesList;
	}

	/**
	 * @return the theaterName
	 */
	public String getTheaterName() {
		return theaterName;
	}

	public int getTheaterSeats() {
		return theaterSeats;
	}

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
					String theatre = theaterName;
					int aT = theaterSeats;

					getMoviesList().add(new Movie(moviePic,mN, mP, aR, mD, mT, theatre, aT));
					
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
