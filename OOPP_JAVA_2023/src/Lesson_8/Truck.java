package Lesson_8;

public class Truck extends Vehicle {

    private int arAxonon;

    Truck() {}

    @Override
    public void transferOwnerShip(String name) {
        System.out.println("Transfer Owner ship from " + super.getOwner() + " to " + name);
        super.setOwner(name);
    }

    @Override
    public void drive() {
            System.out.println("You must be a professional driver. This is a " + arAxonon + " axels truck Mr. " + getOwner());
    }

    @Override
    public void setArThyrwn(int thyres) {

    }

    @Override
    public int getArThyrwn() {
        return -1;
    }

    public void setarAxonon(int arAxonon) {
        this.arAxonon = arAxonon;
    }

    public int getarAxonon() {
        return arAxonon;
    }

    @Override
    public void setkalathi(boolean kalathi) {

    }

    @Override
    public boolean getKalathi() {
        return false;
    }
}
