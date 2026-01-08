package PracticaOPP.Ejercicios.Ejercicio2;

abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
   

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void setBaseSalary(double baseSalary) {
       this.baseSalary = baseSalary;
   }

    abstract double calculateSalary();

    void work() {
        System.out.println(name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", base salary=" + baseSalary + "]";
    }

    
}
