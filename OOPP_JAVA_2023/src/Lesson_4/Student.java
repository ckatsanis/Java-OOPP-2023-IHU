package Lesson_4;

public class Student {
    
    private short am, etos;
    private String name, lname;
    
    public Student() {}
    
    Student(String name, String lname, short am, short etos) {
        this.name = name;
        this.lname = lname;
        this.am = am;
        this.etos = etos;
    }
    
    public String toString() {
        return "Name: " + name + " Last: " + lname + "\nAM: " + am + 
                "\nEtos Eisagwghs: " + etos;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLname(){
        return lname;
    }
    
    public short getAm() {
        return am;
    } 
    
    public int getEtos() {
        return etos;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setLname(String n){
        lname = n;
    }
    
    public void setAm(short am) {
        this.am = am;
    } 
    
    public void setEtos(short etos) {
        this.etos = etos;
    }
   
}

