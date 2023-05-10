package Lesson_7.etraireia;

public class testYpallhlos {
    public static void main(String[] args) {
        Ypallhlos[] yp = new Ypallhlos[3];
        
        yp[0] = new Oromisthios("test 1", 1, "kati", "sindo", 40);
        yp[1] = new Misthotos("test 2", 1, "kati", "sindo", 3, 2);
        yp[2] = new Proistamenos("test 3", 1, "kati", "sindo", 3, 2);
        
        for (int i = 0; i < yp.length; i++) {
            yp[i].toString();
        }
    }
}
