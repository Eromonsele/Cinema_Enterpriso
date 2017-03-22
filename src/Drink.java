/**
 * Store the details of a drink such as the drink name and drink price.
 * 
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class Drink {
	// The drink's name.
	private String drinkName;
	// The drink's price.
	private float drinkPrice;

	/**
	 * Constructor for objects of class Drink
	 * 
	 * @param drinkName
	 *            The drink's name.
	 * @param drinkPrice
	 *            The drink's price.
	 */
	public Drink(String drinkName, float drinkPrice) {
		this.drinkName = drinkName;
		this.drinkPrice = drinkPrice;
	}

	/**
	 * Return the drink's name.
	 * 
	 * @return the drinkName.
	 */
	public String getDrinkName() {
		return drinkName;
	}

	/**
	 * Return the drink's price.
	 * 
	 * @return the drinkPrice.
	 */
	public float getDrinkPrice() {
		return drinkPrice;
	}
}
