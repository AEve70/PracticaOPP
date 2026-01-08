package PracticaOPP.Ejercicios.Ejercicio1;

public class Car extends Vehicle {
    private CarType type;

    public Car(String brand, String model, int year, CarType type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    void start() {
      System.out.println("The car started");
    }

    @Override
    public String toString() {
        return super.toString() + "Car [type=" + type + "]";
    }

    
    
}
