package com.company.cageAdapter;

import com.company.petBuilding.PetSize;

/**
 * RegularCage class to get regular cage size and adapt it later
 */
public class RegularCage {
    private float height;
    private float width;
    private float length;

    /**
     * Conctructor which takes sample(regular size) dimensions as parameters
     * @param height float
     * @param width float
     * @param length float
     */
    public RegularCage(float height, float width, float length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    /**
     * Output parameters of regular cage dimensions
     * @return size of a cage
     */
    public String getRegularCage(PetSize size) {
        String result;
        if(size.equals(PetSize.REGULAR)){
            result = "cage size will be " + getHeight() + " x " + getWidth() + " x " + getLength();
        } else {
            result = "try cage size " + size.name();
        }
        return result;
    }
}



