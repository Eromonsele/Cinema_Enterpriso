import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaOperations {

	private Theater[] theaterList;

	public CinemaOperations() {
		 theaterList = new Theater[10];
	}
	

	public void addTheater(){
		
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
	
	public String display
	
}
