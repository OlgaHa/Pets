package com.company.petBuilding;

import com.company.animalFactory.Animal;
import com.company.petMemento.PetMemento;

import java.util.List;

/**
 * Class to create future pet
 */
public class Pet {
    private String name;
    private Animal baseAnimal;
    private PetSize petSize;
    private List<PetFeatures> features;

    public Pet(String name, Animal baseAnimal, PetSize petSize, List<PetFeatures> features) {
        this.name = name;
        this.baseAnimal = baseAnimal;
        this.petSize = petSize;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public Animal getBaseAnimal() {
        return baseAnimal;
    }

    public PetSize getPetSize() {
        return petSize;
    }

    public List<PetFeatures> getFeatures() {
        return features;
    }


    //For petMemento
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = '" + name +
                ". " + baseAnimal.getAnimalInfo() +
                " Size = " + petSize.name().toLowerCase();
    }

    /**
     * Saves pet data.
     * @return new PetMemento object.
     */
    public PetMemento save() {
        return new PetMemento(name, baseAnimal, petSize);
    }

    /**
     * Retrieves pet data from stack.
     * @param pet PetMemento object.
     */
    public void revert(PetMemento pet) {
        this.name = pet.getName();
        this.baseAnimal = pet.getBaseAnimal();
        this.petSize = pet.getPetSize();
    }
}
