package PracticaOPP.Ejercicios.Ejercicio2;

class Manager extends Employee implements BonusElegible {
  private double bonus;

    public Manager(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
        this.bonus = 0;
    }

    @Override
    public void applyBonus(double amount) {
        this.bonus += amount;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() +" Manager [bonus=" + bonus + "]";
    }

    
}