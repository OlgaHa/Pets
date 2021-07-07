package com.company.cageAdapter;

import com.company.petBuilding.PetSize;

/**
 * CageAdapter class which implements Cage interface,
 * and allows to detect cage parameters based on pet size
 */
public class CageAdapter implements Cage{

    /**
     * Regular cage, which is wrapped and being adapted.
     */
    RegularCage regularCage;

    /**
     * Constructor with parameter of RegularCage object
     * @param regularCage RegularCage
     */
    public CageAdapter(RegularCage regularCage) {
        this.regularCage = regularCage;
    }

    /**
     * Output size of tiny cage
     * @return string of adapted dimensions
     */
    @Override
    public String getTinyCage(PetSize size) {
        String result;
        if(size.equals(PetSize.TINY)){
            result = "cage size will be " + regularCage.getHeight() /2 + " x " + regularCage.getWidth() / 2 + " x " + regularCage.getLength()/2;

        } else {
            result = "try cage size " + size.name();
        }
        return result;
    }


    /**
     * Output size of big cage
     * @return string of adapted dimensions
     */
    @Override
    public String getBigCage(PetSize size) {
        String result;
        if(size.equals(PetSize.BIG)){
            result = "cage size will be " + regularCage.getHeight()*2 + " x " + regularCage.getWidth() * 2 + " x " + regularCage.getLength() * 2;

        } else {
            result = "try cage size " + size.name();
        }
        return result;
    }

    /**
     * Output size of giant cage
     * @return string of adapted dimensions
     */
    @Override
    public String getGiantCage(PetSize size) {
        String result;
        if(size.equals(PetSize.GIANT)){
            result = "cage size will be " + regularCage.getHeight()*10 + " x " + regularCage.getWidth() * 10 + " x " + regularCage.getLength() * 10;

        } else {
            result = "try cage size " + size.name();
        }
        return result;
    }
}
