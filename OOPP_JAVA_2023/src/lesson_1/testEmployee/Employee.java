package lesson_1.testEmployee;

/*Αριθμός Μητρώου, όνομα, επώνυμο, πλήθος
απουσιών, βαθμός στο εργαστήριο, βαθμός στη θεωρία
. */

public class Employee {
    
    private int am, etoi;
    private double vasikos, bonus;
    private String name, lname;
    
    public Employee() {}
    
    Employee(int am, String name, String lname, double vasikos, int etoi, double bonus) {
        this.am = am;
        this.name = name;
        this.lname = lname;
        this.vasikos = vasikos;
        this.etoi = etoi;
        this.bonus = bonus;
    }
    
    public String toString() {
        return "Name: " + name + " Last: " + lname + "\nAM: " + am + 
                "\nVasikos misthos: " + vasikos + "\nEtois Ergasias: "
                + etoi + "\nBonus: " + bonus +
                "\nSynolikos Vathmos: " + salary();
    }
    
    public String getName(){
        return name;
    }
    
    public String getLname(){
        return lname;
    }
    
    public int getAm() {
        return am;
    } 
    
    public double getVasikos() {
        return vasikos;
    }
    
    public int getEtoi() {
        return etoi;
    }
    
    public double bonus() {
        return bonus;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setLname(String n){
        lname = n;
    }
    
    public void setAm(int am) {
        this.am = am;
    } 
    
    public void setVasikos(double vas) {
        vasikos = vas;
    }
    
    public void setBonus(double b) {
        bonus = b;
    }
    
    public void setEtoi(int etoi) {
        this.etoi = etoi;
    }
    
    
    public double salary() {
        return (vasikos + etoi * 10 + bonus);
    }
}
