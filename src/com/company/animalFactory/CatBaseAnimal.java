package com.company.animalFactory;

/**
 * CatBaseAnimal class which implements and overrides methods from Animal interface.
 */
public class CatBaseAnimal implements Animal {
    @Override
    public BaseAnimalType getBaseAnimalType() {
        return BaseAnimalType.CAT;
    }

    @Override
    public String getAnimalInfo() {
        return "Base animal type = " + getBaseAnimalType().name().toLowerCase() + ". Living conditions : ground.";
    }
}
