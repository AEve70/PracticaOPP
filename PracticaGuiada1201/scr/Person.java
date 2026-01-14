package PracticaOPP.PracticaGuiada1201.scr;

public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    // public Person() {}

    public Person(String name, int age, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean addPet(Pet pet){
        return petManager.addPet(pet);
    }

    public PetManager getPetManager() {
        return petManager;
    }

    public void setPetManager(PetManager petManager) {
        this.petManager = petManager;
    }

    public boolean removePet(Pet pet){
        return petManager.removePet(pet);
    }

    public boolean updatePets(int index, Pet pet){
        return petManager.updatePets(index, pet);
    }

    public Pet[] getPets(){
        return petManager.getPets();
    }
}
