package Lesson_7;

public class Vehicle {
    
    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    private SystimaDieuthinsis sysdief;
    private Mixani mixani;
    
    Vehicle() {}
    
    Vehicle(int m, SystimaDieuthinsis sysdief, Mixani mixani) {
        m = etosKat;
        this.sysdief = sysdief;
        this.mixani = mixani;
    }
    
    public void idSet(String id) {
        idioktitis = id;
    }
    
    public void arSet(String ar) {
        arKykloforias = ar;
    }
    
    public String getOwner() {
        return idioktitis;
    }
    public String getAr() {
        return arKykloforias;
    }
    public int getEtos() {
        return etosKat;
    }
    
    public int getCc() {
        return mixani.getCc();
    }
    
    public int getHp() {
        return mixani.getHp();
    }
    
    public void vazeiEmpros() {
        sysdief.vazeiMpros();
        mixani.leitourgia();
    }
    
    public void svisimos() {
        sysdief.svynei();
        mixani.svysimo();
    }
    
}
