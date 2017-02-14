public class Snack {
    private String snackName;
    private double snackPrice;

    public Snack(String snackName, double price) {
        this.snackName = snackName;
        this.snackPrice = price;
    }
    /*
     * Gets the name of snack
     * 
     * @return snackName The name of the snack
     */
    public String getSnackName(){
        return snackName;
    }
    /*
     * @return 
     */
    public double getSnackPrice(){
        return snackPrice;
    }
}
