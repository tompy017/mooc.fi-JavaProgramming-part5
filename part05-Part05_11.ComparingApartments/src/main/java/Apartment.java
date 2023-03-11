
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    //Comparing sizes
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    //Price difference
    public int priceDifference(Apartment compared) {
        int apToComparePrice = this.pricePerSquare * this.squares;
        int apComparedPrice = compared.pricePerSquare * compared.squares;

        if (apToComparePrice >= apComparedPrice) {
            return apToComparePrice - apComparedPrice;
        } else {
            return apComparedPrice - apToComparePrice;
        }
    }

    //More expensive?
    public boolean moreExpensiveThan(Apartment compared) {
        return (this.pricePerSquare * this.squares)
                > (compared.pricePerSquare * compared.squares);
    }
    
    

}
