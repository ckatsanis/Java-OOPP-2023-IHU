package Lesson_9;
import global.*;

public class Etaireia {
    
    public static void main(String[] args) {
        Tilefono[][] til;
        
        System.out.println("Dwste arithmo tilefonon");
        til = new Tilefono[0][UserInput.getInteger()];
        
        for (int i = 0; i < til.length; i++) {
            if (((Math.random()*100)/100) >= 0.6)
                til[0][i] = new Kinito("69876540"+ i + i);
            else
                til[0][i] = new Stathero("23106540"+ i + i);
        }
        
        for (int i = 100; i > (Math.random()*2000); i++) {
            til[0][i].dial(til[0][(int)Math.random()*til.length-1].getNumb());
            System.out.println("Ta deuterolepta klhshs einai " + til[0][i].getSeck()+til[0][i].getSecs());
        }
        
        for (int i = 0; i < til.length; i++) {
            til[0][i].cost();
        }
    }
    
}
