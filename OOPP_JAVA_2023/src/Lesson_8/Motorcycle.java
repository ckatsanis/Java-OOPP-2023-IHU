package Lesson_8;

public class Motorcycle extends Vehicle {

    private boolean kalathi;

    Motorcycle() {}

    @Override
    public void drive() {
            System.out.println("Your car driving license is not enough. You need a special license dear " + getOwner());
    }

    @Override
    public void setArThyrwn(int thyres) {

    }

    @Override
    public int getArThyrwn() {
        return -1;
    }

    @Override
    public void setarAxonon(int arAxonon) {

    }

    @Override
    public int getarAxonon() {
        return -1;
    }

    public void setkalathi(boolean kalathi) {
        this.kalathi = kalathi;
    }

    public boolean getKalathi() {
        return kalathi;
    }

}
