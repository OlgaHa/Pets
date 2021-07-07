package com.company.cageAdapter;

import com.company.petBuilding.PetSize;

/**
 * Represents a cage for chosen animal
 */
public interface Cage {
    /**
     *
     * @param size of a Pet
     * @return tiny cage parameters
     */
    String getTinyCage (PetSize size);
    /**
     *
     * @param size of a Pet
     * @return big cage parameters
     */
    String getBigCage (PetSize size);
    /**
     *
     * @param size of a Pet
     * @return giant cage parameters
     */
    String getGiantCage (PetSize size);
}

