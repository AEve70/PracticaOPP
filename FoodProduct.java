package PracticaOPP;

public class FoodProduct extends Product {
    private String expirationDate;
    private boolean organic;

    
    public FoodProduct() {
        super();
    }

    public FoodProduct(String name, double price) {
        super(name, price);
    }

    public FoodProduct(String name, double price, String expirationDate, boolean organic) {
        super(name, price);
        this.expirationDate = expirationDate;
        this.organic = organic;
    }

    @Override
    public String toString() {
        return "FoodProduct []";
    }

    @Override
    public double calculateDiscount() {
       
        return getPrice() * 0.05;
    }

    
}
