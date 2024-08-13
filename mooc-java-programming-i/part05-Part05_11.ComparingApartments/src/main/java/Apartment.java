
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;   
        }
        return false;
    }
    
    public int getPrice() {
        return this.squares * this.princePerSquare;
    }
    
    public int priceDifference(Apartment compared) {     
        int diff = this.getPrice() - compared.getPrice();
        if (diff < 0) {
            diff = diff * -1;
        }
        return diff;   
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        }
        return false;
    }
}
