package com.company.petMemento;

import com.company.animalFactory.Animal;
import com.company.petBuilding.PetSize;


/**
 * Pet memento class.
 */
public class PetMemento {
    private final String name;
    private final Animal baseAnimal;
    private final PetSize petSize;

    public PetMemento(String name, Animal baseAnimal, PetSize petSize) {
        this.name = name;
        this.baseAnimal = baseAnimal;
        this.petSize = petSize;
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
}
