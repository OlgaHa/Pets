package com.company.foodDecorator;

import com.company.animalFactory.*;

/**
 * Represents simple food for each animal
 */
public class SimpleFood implements Food{
    /**
     * Creates a string of simple food based on animal type
     * @param baseAnimalType BaseAnimalType
     * @return food description
     */
    @Override
    public String feed(BaseAnimalType baseAnimalType) {
        switch (baseAnimalType) {
            case DOG:
                return "Dog food";
            case CAT:
                return "Cat food";
            case BIRD:
                return "Bird food";
            case FISH:
                return "Fish food";
            default:
                return "Bread";
        }
    }
}
