package lesson_1.teststudent;

/*Αριθμός Μητρώου, όνομα, επώνυμο, πλήθος
απουσιών, βαθμός στο εργαστήριο, βαθμός στη θεωρία
. */

public class Student {
    
    private int am, apousies;
    private double gE, gT;
    private String name, lname;
    
    public Student() {}
    
    Student(String name, String lname, int am, int apousies, double gE, double gT) {
        this.name = name;
        this.lname = lname;
        this.am = am;
        this.apousies = apousies;
        this.gE = gE;
        this.gT = gT;
    }
    
    public String toString() {
        return "Name: " + name + " Last: " + lname + "\nAM: " + am + 
                "\nApousies: " + apousies + "\nVathmos Ergasthriou: "
                + gE + "\nVathmos Theorias: " + gT +
                "\nSynolikos Vathmos: " + computeFinal();
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
    
    public int getApousies() {
        return apousies;
    }
    
    public double getGe() {
        return gE;
    }
    
    public double getGt() {
        return gT;
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
    
    public void setApousies(int ap) {
        apousies = ap;
    }
    
    public void setGe(double g) {
        gE = g;
    }
    
    public void setGt(double g) {
        gT = g;
    }
    
    public double computeFinal() {
        return ((0.3 * gE) + (0.7 * gT));
    }
}
