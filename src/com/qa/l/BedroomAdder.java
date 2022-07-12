package com.qa.l;

public class BedroomAdder {

    public void addBedroom(Penthouse penthouse) {

        penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 5);
    }
}
