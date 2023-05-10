package Lesson_7.etraireia;

public class Oromisthios extends Ypallhlos {
    
    private int oresErgasias;
    private double poso;
    
    Oromisthios() {};
    
    Oromisthios(String name, int am, String eidikotita, String address, int ores) {
        super(name, am, eidikotita, address);
        oresErgasias = ores;
        poso = 0;
    }
    
    public String toString() {
        return "O oromisthios ypallilos amoivete me " + ((oresErgasias * 7) * 0.6) + " gia " + oresErgasias;
    }
    
}
