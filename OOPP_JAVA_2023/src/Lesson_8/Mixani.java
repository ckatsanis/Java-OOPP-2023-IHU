package Lesson_8;

public class Mixani {
    
    private int kyvismos;
    private int ipodinami;
    
    Mixani () {}
    
    Mixani (int k, int i) {
        kyvismos = k;
        ipodinami = i;
    }
    
    public int getCc() {
        return kyvismos;
    }
    
    public int getHp() {
        return ipodinami;
    }
    
    public void leitourgia() {
        System.out.println("Leitorgia()");
    }
    
    public void kinisi() {
        System.out.println("kinisi()");
    }
    
    public void svysimo() {
        System.out.println("Svisimo()");
    }
    
}
