package com.company.animalFactory;

/**
 * DogBaseAnimal class which implements and overrides methods from Animal interface.
 */
public class DogBaseAnimal implements Animal {
    @Override
    public BaseAnimalType getBaseAnimalType() {
        return BaseAnimalType.DOG;
    }

    @Override
    public String getAnimalInfo() {
        return "Base animal type = " + getBaseAnimalType().name().toLowerCase() + ". Living conditions : ground.";
    }
}
