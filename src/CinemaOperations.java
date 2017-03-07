public class CinemaOperations {

	private Theater[] theaterList;
	Theater theater;

	public CinemaOperations() {
		theaterList = new Theater[10];
	}

	public void addTheater(String theaterName, int seats) {
		for (int i = 0; i < theaterList.length; i++) {
			theaterList[i] = new Theater(theaterName, seats);
			theater.addMovies();
		}

	}

	public String[] displayMovieName() {
		String[] container = new String[theater.getMoviesList().];
		for (int i = 0; i < getMovies().size(); i++) {
			container[i] = getMovies().get(i).getMovieName();
		}
		return container;
	}
	//
	// public String displayMovieDate(int index) {
	// return getMovies().get(index).getMoviePreview();
	// }
	//
	// public String displayMovieTime(int index) {
	// return getMovies().get(index).getMovieTime();
	// }
	//
	// public String display

	public Theater[] getTheaterList() {
		return theaterList;
	}

	public String displayMovieDate(int index) {
		return "" + theaterList[index].getMoviesList().get(index).getMoviePreview();
	}

}
