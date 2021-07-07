package com.company.petIterator;

public interface Iterator {

    /**
     * Check if collection contains next value.
     * @return boolean.
     */
    boolean hasNext();

    /**
     * Returns next value from array.
     * @return next Object.
     */
    Object next();
}
