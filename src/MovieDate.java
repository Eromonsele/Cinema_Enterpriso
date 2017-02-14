
/*
 * Date.java
 * 
 * This class 
 * @author Eromonsele Okhilua
 * @since 1.0
 * #version 20904
 */

public class MovieDate {

	private String date;
	private String time;
	// private ArrayList<String> timesPreview;

	public MovieDate(String date, String time) {
		this.date = date;
		this.time = time;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

}
