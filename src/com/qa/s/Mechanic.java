package com.qa.s;

public class Mechanic extends Car {

    private int mileage;
    private boolean changeTires;
    private boolean addSpoiler;
    private boolean lowerRideHeight;

    public Mechanic(String colour, String model, int mileage, boolean changeTires, boolean addSpoiler,
            boolean lowerRideHeight) {
        super(colour, model, mileage);
        this.mileage = mileage;
        this.changeTires = changeTires;
        this.addSpoiler = addSpoiler;
        this.lowerRideHeight = lowerRideHeight;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isChangeTires() {
        return changeTires;
    }

    public void setChangeTires(boolean changeTires) {
        this.changeTires = changeTires;
    }

    public boolean isAddSpoiler() {
        return addSpoiler;
    }

    public void setAddSpoiler(boolean addSpoiler) {
        this.addSpoiler = addSpoiler;
    }

    public boolean isLowerRideHeight() {
        return lowerRideHeight;
    }

    public void setLowerRideHeight(boolean lowerRideHeight) {
        this.lowerRideHeight = lowerRideHeight;
    }

    @Override
    public String toString() {
        return "Mechanic [addSpoiler=" + addSpoiler + ", changeTires=" + changeTires + ", lowerRideHeight="
                + lowerRideHeight + ", mileage=" + mileage + "]";
    }

}
