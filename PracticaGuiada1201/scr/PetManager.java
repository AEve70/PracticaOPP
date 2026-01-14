package PracticaOPP.PracticaGuiada1201.scr;

public class PetManager {
    private int count;
    private Pet[] pets;

    public PetManager(int size) {
        this.pets = new Pet[size];
        count = 0;
    }

    public boolean addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {

            if (pets[i] == null) {
                pets[i] = pet;
                count++;
                return true;
            }
        }
        return false;
    }

    public boolean removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)) {
                // corre a la izquierda los elementos posteriores al eliminado
                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[pets.length - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public boolean updatePets(int index, Pet pet){

        if((index >= 0 && index < pets.length) && pets[index] != null){
            pets[index] = pet;
            return true;
        }
        return false;
    }

    public Pet[] getPets() {
        Pet[] pets = new Pet[this.count];

        for(int i = 0; i < this.count; i++){
            pets[i] = this.pets[i];
        }

        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    
}
