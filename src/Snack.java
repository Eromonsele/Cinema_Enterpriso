/**
 * Store the details of a snack
 * such as the snack's name, and the snack's price.
 * 
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class Snack {
	//The name of this snack.
	private String snackName;
	//The price of this snack.
	private float snackPrice;

	/**
	 * Constructor for objects of class Snack.
	 * @param snackName The snack's name.
	 * @param snackPrice The snack's price.
	 */
	public Snack(String snackName, float snackPrice) {
		this.snackName = snackName;
		this.snackPrice = snackPrice;
	}

	/**
	 * @return The snack's name.
	 */
	public String getSnackName() {
		return snackName;
	}

	/**
	 * @return The snack's price.
	 */
	public float getSnackPrice() {
		return snackPrice;
	}

}
