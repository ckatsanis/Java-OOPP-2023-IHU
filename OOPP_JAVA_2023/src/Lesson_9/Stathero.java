package Lesson_9;

public class Stathero extends Tilefono {
    Stathero() {};
    
    Stathero(String number) {
        super(number);
    }

    @Override
    public void dial(String dialNumber) {
        if (dialNumber.charAt(0) == 2) {
            System.out.println("Klhsh apo stathero thlefono " + super.getNumb() + " pros to stathero" + " me arithmo "+ super.getDial());
            super.setSeck((super.getSeck()+(int)(Math.random()*1000)));
        } else  {
            System.out.println("Klhsh apo stathero thlefono " + super.getNumb() + " pros to kinito" + " me arithmo "+ super.getDial());
            super.setSecs((super.getSecs()+(int)(Math.random()*1000)));
        }
    }

    @Override
    public double cost() {
        double sum = 0;
        
        if (super.getNumb().charAt(0) == 6)
            if (super.getDial().charAt(0) == 6)
                sum += super.getSecs() * super.costs[3];
            else
                sum += super.getSecs() * super.costs[2];
        else
            if (super.getDial().charAt(0) == 6)
                sum += super.getSecs() * super.costs[1];
            else
                sum += super.getSecs() * super.costs[0];
        
        return sum;
    }
}
