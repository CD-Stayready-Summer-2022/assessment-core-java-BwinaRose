package com.codedifferently.assessment01.part02;


import java.util.ArrayList;
import java.util.List;

public class PetOwner {
    protected String name;
    protected Pet[] pets = null;

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
//        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
//        pets = new ArrayList<>();
//        pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
//        if (pets.contains(pet)){
//            return true;
//        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
//        if(pets.size() == 0) return 0;
//        Pet youngestPet = pets.get(0);
//        for(int i = 1; i < pets.size(); i++)
//        {
//            if(pets.get(i).age < youngestPet.age)
//            {
//                youngestPet = pets.get(i);
//            }
//        }
//
//        return youngestPet.getAge();
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
//        if(pets.size() == 0) return 0;
//        Pet oldestPet = pets.get(0);
//        for(int i = 1; i < pets.size(); i++)
//        {
//            if(pets.get(i).age > oldestPet.age)
//            {
//                oldestPet = pets.get(i);
//            }
//        }
//
//        return oldestPet.getAge();
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
//        Float sum = 0f;
//        for (Pet i : pets) {
//            sum += i.getAge();
//        }
//        Float avg = sum/ pets.size();
//        return avg;
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        //return pets.size();
        return null;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        //return name;
        return null;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
//        return pets.toArray(new Pet[0]);
        return null;
    }
}
