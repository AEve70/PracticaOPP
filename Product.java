package PracticaOPP;

public abstract class Product {
    private String name;
    private double price;

    public Product() {
        super();
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static double calculateTax(double price) {
        return price * 0.13; // IVA Costa Rica
    }

    public String getName() {
        return name;
    }

    
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    public abstract  double calculateDiscount();
   

    
}
