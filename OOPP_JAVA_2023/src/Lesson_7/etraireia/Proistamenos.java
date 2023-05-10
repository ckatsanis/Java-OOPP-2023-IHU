package Lesson_7.etraireia;

public class Proistamenos extends Ypallhlos {
    private int kids;
    private int trieties;
    private double poso;
    
    Proistamenos() {};
    
    Proistamenos(String name, int am, String eidikotita, String address, int kids, int trieties) {
        super(name, am, eidikotita, address);
        this.kids = kids;
        this.trieties = trieties;
        poso = 0;
    }
    
    public String toString() {
        return "O Proistamenos amoivete me " + ((700 + ((0.5 * 700) * kids) + ((0.10 * 700) * trieties)) * 0.10) + " gia " + kids + " paidia kai " + trieties + " trieties";
    }
}
