package com.company.petMemento;

import com.company.petBuilding.Pet;

import java.util.Stack;

/**
 * Caretaker class for saving or reverting data for a pet.
 */
public class CareTaker {

    // Stack for saving Pet data.
    private Stack<PetMemento> petHistory = new Stack<>();

    /**
     * Saves pet data into stack.
     * @param pet Pet object.
     */
    public void save(Pet pet) {
        petHistory.push(pet.save());
    }

    /**
     * Retrieves pet data from stack.
     * @param pet Pet object.
     */
    public void revert(Pet pet) {
        pet.revert(petHistory.pop());
    }
}
