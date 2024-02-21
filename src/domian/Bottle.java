package domian;

public class Bottle extends Product {
    private double bottleValue;

    public Bottle(long id, String name, double price, int place, double bottleValue) {
        super(id, name, price, place);
        this.bottleValue = bottleValue;
    }
    


}
