package lesson_1.teststudent;
import global.*;
public class TestStudent {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        System.out.println("Prwtos foithths");
        System.out.println("Dwse Onoma");
        s1.setName(UserInput.getString());
        System.out.println("Dwse Epitheto");
        s1.setLname(UserInput.getString());
        System.out.println("Dwse AM");
        s1.setAm(UserInput.getInteger());
        System.out.println("Dwse Apousies");
        s1.setApousies(UserInput.getInteger());
        System.out.println("Dwse Vathmo Ergasthriou");
        s1.setGe(UserInput.getDouble());
        System.out.println("Dwse Vathmo Theorias");
        s1.setGt(UserInput.getDouble());
        
        System.out.println("\n Deuteros Foithths");
        System.out.println("Dwse Onoma");
        s2.setName(UserInput.getString());
        System.out.println("Dwse Epitheto");
        s2.setLname(UserInput.getString());
        System.out.println("Dwse AM");
        s2.setAm(UserInput.getInteger());
        System.out.println("Dwse Apousies");
        s2.setApousies(UserInput.getInteger());
        System.out.println("Dwse Vathmo Ergasthriou");
        s2.setGe(UserInput.getDouble());
        System.out.println("Dwse Vathmo Theorias");
        s2.setGt(UserInput.getDouble());
        
        System.out.println("\n Tritos Foithths");
        System.out.println("Dwse Onoma");
        s3.setName(UserInput.getString());
        System.out.println("Dwse Epitheto");
        s3.setLname(UserInput.getString());
        System.out.println("Dwse AM");
        s3.setAm(UserInput.getInteger());
        System.out.println("Dwse Apousies");
        s3.setApousies(UserInput.getInteger());
        System.out.println("Dwse Vathmo Ergasthriou");
        s3.setGe(UserInput.getDouble());
        System.out.println("Dwse Vathmo Theorias");
        s3.setGt(UserInput.getDouble());
        
        System.out.println();
        System.out.println(s1);
        System.out.println();
        System.out.println(s2);
        System.out.println();
        System.out.println(s3);
        
        compareThreeStudentMarks(s1, s2, s3);
    }
    
    public static void compareThreeStudentMarks(Student s1, Student s2, Student s3) {
        double sum[] = new double[3];
        double temp;
        
        temp = s1.computeFinal();
        sum[0] = temp;
        
        for (int i = 0; i<3; i++) {
            if (temp < s2.computeFinal()) {
                temp = s2.computeFinal();
                sum[i] = temp;
            }
            else if (temp < s3.computeFinal()) {
                temp = s3.computeFinal();
                sum[i] = temp;
            }
            else if (temp < s1.computeFinal()) {
                temp = s1.computeFinal();
                sum[i] = temp;
            }
        }
        
        System.out.println("1) " + sum[0] + "\n 2) " + sum[1] + "\n 3) " + sum[2]);
        
    }
}
