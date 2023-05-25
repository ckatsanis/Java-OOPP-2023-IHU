package Lesson_8;

import Lesson_7.Mixani;
import Lesson_7.SystimaDieuthinsis;

public abstract class Vehicle {

    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    private SystimaDieuthinsis sysdief;
    private Mixani mixani;

    Vehicle() {}

    Vehicle(int m, SystimaDieuthinsis sysdief, Mixani mixani, String name) {
        m = etosKat;
        this.sysdief = sysdief;
        this.mixani = mixani;
        idioktitis = name;
    }

    public void arSet(String ar) {
        arKykloforias = ar;
    }

    public String getOwner() {
        return idioktitis;
    }
    public void setOwner(String name) {
        idioktitis = name;
    }
    public String getAr() {
        return arKykloforias;
    }
    public int getEtos() {
        return etosKat;
    }

    public void setEtos(int etos) {
        etosKat = etos;
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

    public void svisimo() {
        sysdief.svynei();
        mixani.svysimo();
    }

    public void transferOwnerShip(String name) {
        System.out.println("Transfer Owner ship from " + idioktitis + " to " + name);
        idioktitis = name;
    }

    public abstract void drive();
    public abstract void setArThyrwn(int thyres);

    public abstract int getArThyrwn() ;
    public abstract void setarAxonon(int arAxonon);
    public abstract int getarAxonon() ;
    public abstract void setkalathi(boolean kalathi) ;

    public abstract boolean getKalathi() ;

}
