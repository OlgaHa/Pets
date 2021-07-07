package com.company.animalFactory;

/**
 * Factory to generate objects of factory class based on given information.
 */
public interface AbstractAnimalFactory {

    Animal makeAnimal();

    /**
     *  Factory method which can create specific factories for animals based on incoming information.
     * @param type of Base Animal
     * @return factories, based on chosen type
     */

    static AbstractAnimalFactory makeAnimalFactory(BaseAnimalType type) {
        switch (type) {
            case CAT:
                return new CatFactory();
            case BIRD:
                return new BirdFactory();
            case FISH:
                return new FishFactory();
            default:
                return new DogFactory();
        }
    }
}