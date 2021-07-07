package com.company.animalFactory;

/**
 * Common interface that represents Animals to build pets on.
 */
public interface Animal {
    /**
     * gets base animal type
     * @return BaseAnimalType
     */
    BaseAnimalType getBaseAnimalType();

    /**
     * Returns information about animal.
     * @return animal information
     */
    String getAnimalInfo();
}
