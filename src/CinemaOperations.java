import java.util.ArrayList;

public class CinemaOperations {
    
    Theater theater;
    private ArrayList<Theater> theaters;
    private ArrayList<String> receipts;

    public CinemaOperations() {        
        theaters = new ArrayList<Theater>();
    }
    
    public void addTheater(Theater theater){
        theaters.add(theater);
    }
}
