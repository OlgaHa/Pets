package com.company.foodDecorator;

import com.company.animalFactory.BaseAnimalType;

/**
 * Food interface
 */
public interface Food {

    /**
     * Return food fed to the specific pet based on type.
     * @return food.
     */
    String feed(BaseAnimalType baseAnimalType);
}
