import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaOperations {

	private ArrayList<Movie> movies;

	public CinemaOperations() {
		movies = new ArrayList<Movie>();
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

					movies.add(new Movie(mN, mP, aR, mD, mT, theatre, aT));
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Movie> getMovies() {
		return movies;
	}

	public String[] displayMovieName() {
		String[] container = new String[getMovies().size()];
		for (int i = 0; i < getMovies().size(); i++) {
			container[i] = getMovies().get(i).getMovieName();
		}
		return container;
	}

	public String displayMovieDate(int index) {
		return getMovies().get(index).getMoviePreview();
	}

	public String displayMovieTime(int index) {		 
		return getMovies().get(index).getMovieTime();
	}
	
}
