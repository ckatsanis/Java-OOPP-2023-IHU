package Lesson_7.etraireia;

public class Misthotos extends Ypallhlos{
    
    private int kids;
    private int trieties;
    private double poso;
    
    Misthotos() {};
    
    Misthotos(String name, int am, String eidikotita, String address, int kids, int trieties) {
        super(name, am, eidikotita, address);
        this.kids = kids;
        this.trieties = trieties;
        poso = 0;
    }
    
    public String toString() {
        return "O Misthotos ypallilos amoivete me " + (700 + ((0.5 * 700) * kids) + ((0.10 * 700) * trieties)) + " gia " + kids + " paidia kai " + trieties + " trieties";
    }
    
}
