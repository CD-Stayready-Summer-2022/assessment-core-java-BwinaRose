package com.codedifferently.assessment01.part02;
import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    private String name;
    private Pet[] pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        addToPetsArr(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pet.equals(pets[i])) {
                pets[i].setOwner(null);
                pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet p : pets){
            if(p.equals(pet))
                return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        if(pets.length == 0) return 0;
        Pet youngestPet = pets[0];
        for(int i = 1; i < pets.length; i++)
        {
            if(pets[i].age < youngestPet.age)
            {
                youngestPet = pets[i];
            }
        }
        return youngestPet.getAge();
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        if(pets.length == 0) return 0;
        Pet oldestPet = pets[0];
        for(int i = 1; i < pets.length; i++)
        {
            if(pets[i].age > oldestPet.age)
            {
                oldestPet = pets[i];
            }
        }
        return oldestPet.getAge();
    }

    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0;
        for(Pet p : pets){
            sum += p.getAge();
        }
        float length = pets.length;
        return sum / length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length; //returns Integer of how many pets are in array
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;  // returns array of pets
    }

    private void addToPetsArr(Pet pet){
        pet.setOwner(this); //ensures the proper array of pets per owner

        if(pets == null)
            pets = new Pet[]{pet}; //adds pet if room
        else {
            Pet[] biggerArr = new Pet[pets.length + 1]; //creates a bigger pet array to add to
            System.arraycopy(pets, 0, biggerArr, 0, pets.length); //copies the original array to new array
            pets[pets.length - 1] = pet;
            pets = biggerArr; //overwrites the original pet array with bigger one
        }
    }
}
