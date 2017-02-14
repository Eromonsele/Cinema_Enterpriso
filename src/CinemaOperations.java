import java.util.ArrayList;

public class CinemaOperations {

	Theater theater;
	private ArrayList<Theater> theaters;	
	private ArrayList<Snack> snacksList;

	public CinemaOperations() {
		theaters = new ArrayList<Theater>();
	}
	/**
	 * @param theater
	 */
	public void addTheater(Theater theater) {
		theaters.add(theater);
	}
	
	/**
	 * @param snack
	 */
	public void addSnacks(Snack snack){
		
	}
	/**
	 * Get the list of Snacks sold at the theater
	 * 
	 * @return the snacksList
	 */
	public ArrayList<Snack> getSnacksList() {
		return snacksList;
	}

}
