import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Theater {
	private String theaterName;
	private
	private ArrayList<Movie> moviesList;

	public Theater() {
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

	public void addMovies() {

		try {
			String line = null;
			Scanner input = new Scanner(new File("fileMovie.txt"));

			while (input.hasNextLine()) {
				if ((line = input.nextLine()) != null) {
					String[] word = line.split(";");
					String mN = word[0];
					double mP = Double.parseDouble(word[1]);
					String aR = word[2];
					String mD = word[3];
					String mT = word[4];
					String theatre = word[5];
					int aT = Integer.parseInt(word[6]);

					moviesList.add(new Movie(mN, mP, aR, mD, mT, theatre, aT));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
