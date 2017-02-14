/*
 * 
 */
public class Snack {
	private String snackName;
	private double snackPrice;

	public Snack(String snackName, double price) {
		this.setSnackName(snackName);
		this.setSnackPrice(price);
	}

	/**
	 * @return the snackName
	 */
	public String getSnackName() {
		return snackName;
	}

	/**
	 * @param snackName
	 *            the snackName to set
	 */
	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}

	/**
	 * @return the snackPrice
	 */
	public double getSnackPrice() {
		return snackPrice;
	}

	/**
	 * @param snackPrice
	 *            the snackPrice to set
	 */
	public void setSnackPrice(double snackPrice) {
		this.snackPrice = snackPrice;
	}

}
