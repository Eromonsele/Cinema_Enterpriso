/*
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class Drink {
	private String drinkName;
	private float drinkPrice;

	public Drink(String drinkName, float drinkPrice) {
		this.drinkName = drinkName;
		this.drinkPrice = drinkPrice;
	}

	/**
	 * @return the drinkName
	 */
	public String getDrinkName() {
		return drinkName;
	}

	/**
	 * @return the drinkPrice
	 */
	public float getDrinkPrice() {
		return drinkPrice;
	}
}
