package PracticaOPP;

public class ElectronicProduct extends Product {
    

    public ElectronicProduct() {
        super();
    }

    public ElectronicProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.02;
    }

    
}
