package com.company.petIterator;

import java.util.ArrayList;
import java.util.List;


/**
 *  PetRepository class which implements Aggregate interface.
 */
public class PetRepository implements Aggregate {

    //List of created pets
    private List<String> pets = new ArrayList<>();

    public List<String> getPets() {
        return pets;
    }

    /**
     * Gets iterator.
     *
     * @return PetIterator object.
     */
    @Override
    public Iterator getIterator() {
        return new PetIterator();
    }

    /**
     * PetIterator class which implements Iterator interface.
     */
    private class PetIterator implements Iterator {

        private int index = 0;

        /**
         * Check if collection contains next value.
         *
         * @return boolean.
         */
        @Override
        public boolean hasNext() {
            return index < pets.size();
        }

        /**
         * Returns next value from list.
         *
         * @return Name of pets created .
         */
        @Override
        public Object next() {
            return pets.get(index++);
        }
    }
}
