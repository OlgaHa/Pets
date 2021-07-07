package com.company.foodDecorator;

import com.company.animalFactory.BaseAnimalType;

/**
 * Adds meat to the animal food
 */
public class EnhancedWithVegyFood extends EnhancedFood {

    /**
     * Food with added meat.
     * @param customFood Food.
     */
    public EnhancedWithVegyFood(Food customFood) {
        super(customFood);
    }

    /**
     * @return food description for a concrete animal with added vegetables.
     */
    public String feed(BaseAnimalType baseAnimalType) {
        return customFood.feed(baseAnimalType) + addVegetables();
    }

    /**
     * @return added vegetables
     */
    private String addVegetables() {
        return " + vegetables";
    }

}
