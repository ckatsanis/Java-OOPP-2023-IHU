package Lesson_7;
import global.*;

public class JAVA2Erg78 {

    public static void main(String[] args) {
        Vehicle[] veh = new Vehicle[3];
        
        int i = 0;
        
        veh[0] = new Vehicle(2020, new SystimaDieuthinsis(), new Mixani(1500, 200));
        veh[1] = new Vehicle(2015, new SystimaDieuthinsis(), new Mixani(2000, 500));
        veh[2] = new Vehicle(2023, new SystimaDieuthinsis(), new Mixani(300, 1000));
        
        System.out.println("Ti kivismo exei to autokinito;");
        i = UserInput.getInteger();
        System.out.println("To autokinito exei " + veh[i].getCc() + " cc");
        
        System.out.println("Ti ypodinami exei to autokinito;");
        i = UserInput.getInteger();
        System.out.println("To autokinito exei " + veh[i].getHp() + " hp");
        
        System.out.println("Pios einai o idioktitis toy autokinhtoy kai to etos kataskeyhs;");
        i = UserInput.getInteger();
        System.out.println("idioktitis einai o " + veh[i].getOwner() + " me etos kataskeuhs " + veh[i].getEtos());
        
        veh[i].vazeiEmpros();
        veh[i].svisimos();
        
    }
}
