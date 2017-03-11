import java.util.ArrayList;

public class CinemaOperations {

	private ArrayList<Theater> theaters;

	public CinemaOperations() {
		theaters = new ArrayList<Theater>();
	}

	public ArrayList<Theater> getTheaters() {
		return theaters;
	}

	public void addTheater() {
		for (int i = 0; i < 10; i++) {
			theaters.add(new Theater("Theater " + (i + 1), 200));
			theaters.get(i).addMovies();
		}
	}

	public String[] displayTheaterName() {
		String[] container = new String[theaters.size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = theaters.get(i).getTheaterName();
		}
		return container;
	}

	public String[] displayMovieName(int index) {
		String[] container = new String[theaters.get(index).getMoviesList().size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = theaters.get(i).getMoviesList().get(i).getMovieName();
		}
		return container;
	}

	public String displayMoviePrice(int index) {
		return "£" + theaters.get(index).getMoviesList().get(index).getMoviePrice();
	}

	public String displayAgeRestrictions(int index) {
		return theaters.get(index).getMoviesList().get(index).getAgeRestrictions();
	}

	public String displayMovieDate(int index) {
		return theaters.get(index).getMoviesList().get(index).getMoviePreview();
	}

	public String displayMovieTime(int index) {
		return theaters.get(index).getMoviesList().get(index).getMovieTime();
	}

	public int displayAvailableTickets(int index) {
		return theaters.get(index).getMoviesList().get(index).getAvailableTickets() ;
	}

	public String displayMoviePic(int index) {
		return theaters.get(index).getMoviesList().get(index).getMoviePicture();
	}

}
