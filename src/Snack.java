/*
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class Snack {
	private String snackName;
	private float snackPrice;

	/**
	 * @param snackName
	 * @param snackPrice
	 */
	public Snack(String snackName, float snackPrice) {
		this.snackName = snackName;
		this.snackPrice = snackPrice;
	}

	/**
	 * @return the snackName
	 */
	public String getSnackName() {
		return snackName;
	}

	/**
	 * @return the snackPrice
	 */
	public float getSnackPrice() {
		return snackPrice;
	}

}
