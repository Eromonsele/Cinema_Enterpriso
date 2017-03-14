import java.util.ArrayList;
import java.util.Random;

public class CinemaOperations {

	private ArrayList<Theater> theaters;
	private ArrayList<Snack> snacks;
	private ArrayList<Drink> drinks;

	public CinemaOperations() {
		theaters = new ArrayList<Theater>();
	}

	/**
	 * @return the theaters
	 */
	public ArrayList<Theater> getTheaters() {
		return theaters;
	}
	
	/**
	 * @return the snacks
	 */
	public ArrayList<Snack> getSnacks() {
		return snacks;
	}

	/**
	 * @return the drinks
	 */
	public ArrayList<Drink> getDrinks() {
		return drinks;
	}

	public void addTheater() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			theaters.add(new Theater("Theater " + (i + 1), 200));
			theaters.get(i).addMovies();
		}
	}
	
	public void addDrinks(){
		
	}
	
	public void addSnacks(){
		
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
		return "£" + theaters.get(index).getMoviesList().get(index).getMoviePrice() + 0;
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
		return theaters.get(index).getMoviesList().get(index).getAvailableTickets();
	}

	public String displayMoviePic(int index) {
		return theaters.get(index).getMoviesList().get(index).getMoviePicture();
	}

	public String setPrices(String filmClassfication) {
		switch (filmClassfication) {
		case "U":
			return "universal";
		case "PG":
			return "parental guidance";
		case "12A":
			return "under 12";
		case "15":
			return "suitable for age 15 and older";
		case "18":
			return "suitable for ages for 18 and older";
		default:
			return "drop dead";

		}
	}

	public float calcTickets(int numberOfTickets, float ticketPrice) {

		return ticketPrice * numberOfTickets;
	}

	public float totalCost(float calcTickets, float calcSnacks) {

		return calcTickets + calcSnacks;
	}
}
