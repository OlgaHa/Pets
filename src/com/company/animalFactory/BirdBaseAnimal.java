package com.company.animalFactory;

/**
 * BirdBaseAnimal class which implements and overrides methods from Animal interface.
 */
public class BirdBaseAnimal implements Animal {
    @Override
    public BaseAnimalType getBaseAnimalType() {
        return BaseAnimalType.BIRD;
    }

    @Override
    public String getAnimalInfo() {
        return "Base animal type = " + getBaseAnimalType().name().toLowerCase() + ". Living conditions : ground, air.";
    }
}
