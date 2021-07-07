package com.company.petBuilding;

import com.company.animalFactory.Animal;

import java.util.LinkedList;
import java.util.List;

public final class PetBuilder {
    private String name;
    private Animal baseAnimal;
    private PetSize size;
    private List<PetFeatures> features;

    private PetBuilder(){
        features = new LinkedList<>();
    }

    /**
     * Creating a new instance of Pet Builder
     * @return PetBuilder.
     */
    public static PetBuilder aPet() {
        return new PetBuilder();
    }

    /**
     * sets pet base
     * @param baseAnimal Animal
     * @return pet with that base
     */
    public PetBuilder withBase(Animal baseAnimal) {
        this.baseAnimal = baseAnimal;
        return this;
    }

    /**
     * sets pet size
     * @param size PetSize
     * @return pet with that size
     */
    public PetBuilder withSize(PetSize size) {
        this.size = size;
        return this;
    }

    /**
     * sets pet name
     * @param name String
     * @return pet with that name
     */
    public PetBuilder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * sets pet features
     * @param feature PetFeatures
     * @return pet with that features
     */
    public PetBuilder withFeatures(PetFeatures feature) {
        this.features.add(feature);
        return this;
    }

    /**
     * Builds and returns final Pet object.
     * @return Pet.
     */
    public Pet build(){
        return new Pet(name, baseAnimal, size, features);
    }
}
