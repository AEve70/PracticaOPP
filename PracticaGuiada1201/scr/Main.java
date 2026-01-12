package PracticaOPP.PracticaGuiada1201.scr;

class Main{
    public static void main(String[] args){
        
        // int[] numbers = {10,20,30,40,50};

        // String[] fruits = new String[3];

        // System.out.println(numbers[2]);
        // System.out.println(fruits[2]);

        //Recorrer arrays (for tradicional o for-each)

        Person person1 = new Person("Layla", 25, 3);

        System.out.println("Names of pets: "+ person1.getPets());

        for(Pet pet: person1.getPets()){
            System.out.println(pet.getPetName());
        } //No hay nada que recorrer, porque al ser objetos queda en null
        
       
    }
}
