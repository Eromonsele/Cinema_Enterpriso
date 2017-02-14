/*
 * @author Eromonsele Okhilua
 * @version 1.0.2
 * @date 11-02-2017
 */
public class Snack {
	private String snackName;
	private double snackPrice;

	public Snack(String snackName, double snackPrice) {
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
	public double getSnackPrice() {
		return snackPrice;
	}

}
