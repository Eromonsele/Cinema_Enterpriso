
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater theater = new Theater("sele", 250);
		theater.addMovie(new Movie("Killer frost", 3.0, "E"));
		theater.addMovie(new Movie("Killer frost6", 3.0, "E"));		
		theater.addMovie(new Movie("Killer frost5", 3.0, "E"));		
		theater.addMovie(new Movie("Killer frost4", 3.0, "E"));		
		theater.addMovie(new Movie("Killer frost2", 3.0, "E"));		
		theater.addMovie(new Movie("Killer frost1", 3.0, "E"));
		
		int i = 0;
		while (i < theater.getMovieCatalog().size()) {
			System.out.print(theater.getMovieCatalog().get(i).getMovieName() + "\n");
			i++;
			
		}
	}

}
