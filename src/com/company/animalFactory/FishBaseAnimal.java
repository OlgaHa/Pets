package com.company.animalFactory;

/**
 * FishBaseAnimal class which implements and overrides methods from Animal interface.
 */
public class FishBaseAnimal implements Animal {
    @Override
    public BaseAnimalType getBaseAnimalType() {
        return BaseAnimalType.FISH;
    }

    @Override
    public String getAnimalInfo() {
        return "Base animal type = " + getBaseAnimalType().name().toLowerCase() + ". Living conditions : water.";
    }
}
