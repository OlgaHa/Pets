package com.company.foodDecorator;

import com.company.animalFactory.BaseAnimalType;

/**
 * EnhancedFood on the base of Food
 */
public abstract class EnhancedFood implements Food{

    /**
     * Existing food is turned to the custom food
     */
 protected Food customFood;

    /**
     * The constructor to return enhanced food
     * @param customFood Food
     */
    public EnhancedFood(Food customFood) {
        this.customFood = customFood;
    }

    /**
     * @return default food.
     */
    @Override
    public String feed(BaseAnimalType baseAnimalType) {
        return customFood.feed(baseAnimalType);
    }
}
