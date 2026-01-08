package PracticaOPP.Ejercicios.Ejercicio1;

public class ElectricCar extends Car implements Electric {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }

    
    @Override
    void start() {
        System.out.println("The electric car started");
    }


    @Override
    public String toString() {
        return "ElectricCar [batteryLevel=" + batteryLevel + "] " + super.toString();
    }


    @Override
    public void chargeBattery() {
      this.batteryLevel = 100;
      System.out.println("The battery is charged to 100%");
    }

}
