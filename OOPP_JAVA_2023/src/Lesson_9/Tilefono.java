package Lesson_9;
import global.*;

public abstract class Tilefono {
    private String numb;
    private String dialNum;
    private int secK;
    private int secS;
    
    double[] costs = {0.02, 0.05, 0.06, 0.07};
    
    Tilefono() {};
    Tilefono(String numb) {
        this.numb = numb;
    }
    
    public String getNumb() {
        return numb;
    }
    
    public String getDial() {
        return dialNum;
    }
    
    public void setNumb(String num) {
        numb = num;
    }
    
    public void setdialNumb(String num) {
        dialNum = num;
    }   
    
    public double[]  getCost() {
        return costs;
    }
    
    public int getSeck() {
        return secK;
    }
    
    public void setSeck(int sec) {
        this.secK = sec;
    }
    
    public int getSecs() {
        return secS;
    }
    
    public void setSecs(int sec) {
        this.secS = sec;
    }
    
    public abstract void dial(String dialNumber);
    
    public abstract double cost();
}
