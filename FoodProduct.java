package PracticaOPP;

public class FoodProduct extends Product {
    private String expirationDate;
    private boolean organic;

    
    public FoodProduct() {
        super();
    }

    public FoodProduct(String name, double price , ProductStatus status) {
        super(name, price, status);
    }

    public FoodProduct(String name, double price, String expirationDate, boolean organic , ProductStatus status) {
        super(name, price, status);
        this.expirationDate = expirationDate;
        this.organic = organic;
    }

    @Override
    public String toString() {
          return super.toString() +
                ", FoodProduct{expirationDate='" + expirationDate +
                "', organic=" + organic + "}";
    }
    

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    
}
