package lesson_1.testEmployee;
import global.*;
public class TestEmploeyee {

    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        System.out.println("Prwtos Employee");
        System.out.println("Dwse Onoma");
        e1.setName(UserInput.getString());
        System.out.println("Dwse Epitheto");
        e1.setLname(UserInput.getString());
        System.out.println("Dwse AM");
        e1.setAm(UserInput.getInteger());
        System.out.println("Dwse Vasiko mistho");
        e1.setVasikos(UserInput.getDouble());
        System.out.println("Dwse Bonus");
        e1.setBonus(UserInput.getDouble());
        System.out.println("Dwse Etoi Ergasias");
        e1.setEtoi(UserInput.getInteger());
        
        System.out.println("Deuteros Employee");
        System.out.println("Dwse Onoma");
        e2.setName(UserInput.getString());
        System.out.println("Dwse Epitheto");
        e2.setLname(UserInput.getString());
        System.out.println("Dwse AM");
        e2.setAm(UserInput.getInteger());
        System.out.println("Dwse Vasiko mistho");
        e2.setVasikos(UserInput.getDouble());
        System.out.println("Dwse Bonus");
        e2.setBonus(UserInput.getDouble());
        System.out.println("Dwse Etoi Ergasias");
        e2.setEtoi(UserInput.getInteger());
        
        System.out.println();
        System.out.println(e1);
        System.out.println();
        System.out.println(e2);
        
        FindLowSalary(e1, e2);
    }
    
    public static void FindLowSalary(Employee e1, Employee e2) {

        if ((e1.getVasikos() < 1200) && (e1.getEtoi() >= 5)) {
            e1.setVasikos(e1.getVasikos()+100);
            System.out.println("o " + e1.getLname() + " einai xamilomisthos");
            System.out.println(e1);
        } else if ((e2.getVasikos() < 1200) && (e2.getEtoi() >= 5)) {
            e2.setVasikos(e2.getVasikos()+100);
            System.out.println("o " + e2.getLname() + " einai xamilomisthos");
            System.out.println(e2);
        }
        
    }
}
