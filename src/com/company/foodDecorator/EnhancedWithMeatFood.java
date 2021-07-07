package com.company.foodDecorator;

import com.company.animalFactory.BaseAnimalType;

/**
 * Adds meat to the animal food
 */
public class EnhancedWithMeatFood extends EnhancedFood {

    /**
     * Food with added meat.
     * @param customFood Food.
     */
    public EnhancedWithMeatFood(Food customFood) {
        super(customFood);
    }

    /**
     * @return food description for a concrete animal with added meat.
     */
    public String feed(BaseAnimalType baseAnimalType) {
        return customFood.feed(baseAnimalType) + addMeat();
    }

    /**
     * @return added meat
     */
    private String addMeat() {
        return " + raw meet";
    }

}
