package PracticaOPP.Ejercicios.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Corolla", 2020, CarType.SEDAN);
        Vehicle myElectricCar = new ElectricCar("Tesla", "Model 3", 2023, CarType.SPORTS, 56);

        myCar.start();
        myElectricCar.start();

        ((ElectricCar) myElectricCar).chargeBattery();
        
        System.out.println(myCar.toString());
        System.out.println(myElectricCar.toString());
    }
}
