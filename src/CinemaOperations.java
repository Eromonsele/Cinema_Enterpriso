import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class CinemaOperations {

	private ArrayList<Theater> theaters;
	private ArrayList<Snack> snacks;
	private ArrayList<Drink> drinks;
	private ArrayList<Float> receiptPrices;
	
	/**
	 * 
	 */
	public CinemaOperations() {
		theaters = new ArrayList<Theater>();
		snacks = new ArrayList<Snack>();
		drinks = new ArrayList<Drink>();
		receiptPrices = new ArrayList<Float>();
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

	/**
	 * 
	 */
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

	/**
	 * 
	 */
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

	/**
	 * @return
	 */
	public String[] displayTheaterName() {
		String[] container = new String[theaters.size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = theaters.get(i).getTheaterName();
		}
		return container;
	}

	/**
	 * @param index
	 * @return
	 */
	public String[] displayMovieName(int index) {
		String[] container = new String[theaters.get(index).getMoviesList().size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = theaters.get(i).getMoviesList().get(i).getMovieName();
		}
		return container;
	}

	/**
	 * @param index
	 * @return
	 */
	public String displayMoviePrice(int index) {
		return "�" + String.format("%.2f",theaters.get(index).getMoviesList().get(index).getMoviePrice());
	}

	/**
	 * @param index
	 * @return
	 */
	public String displayAgeRestrictions(int index) {
		return "Film Rating: " + theaters.get(index).getMoviesList().get(index).getAgeRestrictions();
	}

	/**
	 * @param index
	 * @return
	 */
	public String displayMovieDate(int index) {
		return theaters.get(index).getMoviesList().get(index).getMoviePreview();
	}

	/**
	 * @param index
	 * @return
	 */
	public String displayMovieTime(int index) {
		return theaters.get(index).getMoviesList().get(index).getMovieTime();
	}

	/**
	 * @param index
	 * @return
	 */
	public String displayAvailableTickets(int index) {
		return "/" + theaters.get(index).getMoviesList().get(index).getAvailableTickets();
	}

	/**
	 * @param index
	 * @return
	 */
	public String displayMoviePic(int index) {
		return theaters.get(index).getMoviesList().get(index).getMoviePicture();
	}

	/**
	 * @return
	 */
	public String[] displaySnacks() {
		String[] container = new String[getSnacks().size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = getSnacks().get(i).getSnackName();
		}
		return container;
	}

	/**
	 * @param index
	 * @return
	 */
	public String displaySnacksPrice(int index) {
		return "�" + String.format("%.2f",getSnacks().get(index).getSnackPrice());
	}

	/**
	 * @return
	 */
	public String[] displayDrinks() {
		String[] container = new String[getDrinks().size()];
		for (int i = 0; i < container.length; i++) {
			container[i] = getDrinks().get(i).getDrinkName();
		}
		return container;
	}

	/**
	 * @param index
	 * @return
	 */
	public String displayDrinkPrice(int index) {
		return "�" + String.format("%.2f",getDrinks().get(index).getDrinkPrice());
	}

	/**
	 * @param age
	 * @return
	 */
	public boolean isOfAge(int age) {
		return age >= 18;
	}

	/**
	 * @return
	 */
	public String receiptInfoFormatter(String itemName, String itemPrice, String quantity) {
		return String.format("%-20s            %-12s%10s\n", itemName, quantity, itemPrice);
	}
	
	/**
	 * @param quantity
	 * @param filmPrice
	 * @return
	 */
	public float totalTickets(int quantity, float filmPrice){
		return quantity * filmPrice;
	}

	/**
	 * @return the receiptPrices
	 */
	public ArrayList<Float> getReceiptPrices() {
		return receiptPrices;
	}
	
	public String calcReceiptItems(){
		float totalPrice = 0;
		for (int i = 0; i < getReceiptPrices().size(); i++) {
			totalPrice += getReceiptPrices().get(i);			
		}
		return String.format("%.2f",totalPrice);
	}
	
	public int remainingTickets(int quantity, int availableTickets){
		return availableTickets - quantity;
	}
}
