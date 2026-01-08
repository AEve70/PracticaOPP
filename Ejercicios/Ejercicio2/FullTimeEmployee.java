package PracticaOPP.Ejercicios.Ejercicio2;

class FullTimeEmployee extends Employee {
    Department department;
    
    
    public FullTimeEmployee(int id, String name, double baseSalary, Department department) {
        super(id, name, baseSalary);
        this.department = department;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public String toString() {
        return super.toString() +" FullTimeEmployee [department=" + department + "]";
    }

    
}