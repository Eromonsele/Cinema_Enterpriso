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
		System.out.println(theaters);
	}

	public String[] displayTheaterName() {
		String[] container = new String[theaters.size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = theaters.get(i).getTheaterName();
		}
		return container;
	}

	public String displayMovieName(int index) {
		return theaters.get(index).getMoviesList().get(index).getMovieName();
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

	public String displayAvailableTickets(int index) {
		return theaters.get(index).getMoviesList().get(index).getAvailableTickets() + "";
	}

}
