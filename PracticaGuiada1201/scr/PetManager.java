package PracticaOPP.PracticaGuiada1201.scr;

public class PetManager {
    private int count;
    private Pet[] pets;

    public PetManager(int size){
        this.pets = new Pet[size];
        count = 0;
    }

    public boolean addPet(Pet pet){
        for(int i = 0; i < pets.length; i++){

            if(pets[i] == null){
                pets[i] = pet;
                count++;
                return true;
            }
        }
        return false;
    }
}
