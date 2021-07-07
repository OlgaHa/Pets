package com.company.animalFactory;

/**
 * Factory to generate objects of concrete class based on given information.
 */
public class CatFactory implements AbstractAnimalFactory {
    /*
     * Factory method which can create specific animals when chosen
     * @return Animal
     */
    @Override
    public Animal makeAnimal() {
        return new CatBaseAnimal();
    }
}
