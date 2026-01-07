package PracticaOPP.scr;

abstract class Product {

    private String name;
    private double price;
    protected ProductStatus status;

    public Product() {
        super();
    }

    public Product(String name, double price, ProductStatus status) {
        this.name = name;
        this.price = price;
        this.status = status;
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

    public ProductStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    public abstract double calculateDiscount();

    public boolean isAvailableForSale() {
        return status == ProductStatus.AVAILABLE;
    }

}
