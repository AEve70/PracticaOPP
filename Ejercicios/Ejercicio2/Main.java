package PracticaOPP.Ejercicios.Ejercicio2;

class Main{
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee(1, "Jay Smith", 535000, Department.FINANCE);
        Employee employee2 = new Manager(2, "Sara Johnson", 750000);

        System.out.println("Salary of employee 1: " + employee1.calculateSalary());
        System.out.println("Salary of employee 2: " + employee2.calculateSalary());
        
        Manager manager = (Manager) employee2;
        manager.applyBonus(50000);
        System.out.println("Manager salary with bonus: " + manager.calculateSalary());

        System.out.println(employee1);
        System.out.println(manager);
    }
}