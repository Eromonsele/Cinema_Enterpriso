import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
		for (int i = 0; i < 10; i++) {
			theaters.add(new Theater("Theater " + (i + 1), 200));
			theaters.get(i).addMovies();
		}
	}

	public void addDrinks() {
		try {
			String line = null;
			Scanner input = new Scanner(new File("drinksList.txt"));

			while (input.hasNextLine()) {
				if ((line = input.nextLine()) != null) {
					String[] word = line.split(";");
					String drinkName = word[0];
					float drinkPrice = Float.parseFloat(word[1]);

					getDrinks().add(new Drink(drinkName, drinkPrice));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void addSnacks() {
		try {
			String line = null;
			Scanner input = new Scanner(new File("snacksList.txt"));

			while (input.hasNextLine()) {
				if ((line = input.nextLine()) != null) {
					String[] word = line.split(";");
					String snacksName = word[0];
					float snackPrice = Float.parseFloat(word[1]);

					getSnacks().add(new Snack(snacksName, snackPrice));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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

	public String[] displaySnacks() {
		String[] container = new String[getSnacks().size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = getSnacks().get(i).getSnackName();
		}
		return container;
	}

	public String displaySnacksPrice(int index) {
		return "£" + getSnacks().get(index).getSnackPrice();
	}

	public String[] displayDrinks() {
		String[] container = new String[getDrinks().size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = getDrinks().get(i).getDrinkName();
		}
		return container;
	}

	public String displayDrinkPrice(int index) {
		return "£" + getDrinks().get(index).getDrinkPrice();
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
