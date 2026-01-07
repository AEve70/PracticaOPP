package PracticaOPP.scr;

public class Main {
    public static void main(String[] args) {
        // Product p2 = new FoodProduct("Leche", 1200);
        ElectronicProduct p3 = new ElectronicProduct("Mouse", 1200, ProductStatus.AVAILABLE);



        // System.out.println(p2.toString());
        System.out.println(p3.calculateDiscount());

        System.out.println("p3 is AVAILABLE: " + p3.isAvailableForSale());

    

    }
}
