package Lesson_8;

public class Car extends Vehicle {

    private int arThyrwn;

    Car () {}

    @Override
    public void transferOwnerShip(String name) {
        System.out.println("Transfer Owner ship from " + super.getOwner() + " to " + name);
        super.setOwner(name);
    }

    @Override
    public void drive() {
            System.out.println("You need a drive license dear " + getOwner());
    }

    public void setArThyrwn(int thyres) {
        arThyrwn = thyres;
    }

    public int getArThyrwn() {
        return arThyrwn;
    }

    @Override
    public void setarAxonon(int arAxonon) {

    }

    @Override
    public int getarAxonon() {
        return -1;
    }

    @Override
    public void setkalathi(boolean kalathi) {

    }

    @Override
    public boolean getKalathi() {
        return false;
    }
}
