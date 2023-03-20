package Lesson_2.testStudent;
import global.*;
import lesson_1.teststudent.Student;

public class testStudent {

    public static void main(String[] args) {

        Student[] lab;

        System.out.println("Give number of students in lab: ");
        lab = new Student[UserInput.getInteger()];

        for (int i = 0; i < lab.length; i++) {
            Student st = new Student();
            lab[i] = new Student();

            System.out.println(i +" foithths");
            System.out.println("Dwse Onoma");
            st.setName(UserInput.getString());
            System.out.println("Dwse Epitheto");
            st.setLname(UserInput.getString());
            System.out.println("Dwse AM");
            st.setAm(UserInput.getInteger());
            System.out.println("Dwse Apousies");
            st.setApousies(UserInput.getInteger());
            System.out.println("Dwse Vathmo Ergasthriou");
            st.setGe(UserInput.getDouble());
            System.out.println("Dwse Vathmo Theorias");
            st.setGt(UserInput.getDouble());

            insertStudent(lab, st, i);
        }

        displayLab(lab);
        passed(lab);
        avgStudents(lab);
        System.out.println(lab[bestStudent(lab)]);
    }

    public static void insertStudent(Student[] lab, Student st, int pos) {
        lab[pos] = st;
    }

    public static void displayLab(Student[] lab) {
        for (int i = 0; i < lab.length; i++)
            System.out.println(lab[i]);
    }

    public static void passed(Student[] lab) {
        int counter = 0;

        for (int i = 0; i < lab.length; i++)
            if ((lab[i].getGe() + lab[i].getGt()) >= 5)
                counter++;

        System.out.println("Passed: " + counter);
    }

    public static void avgStudents(Student[] lab) {
        int avg = 0;

        for (int i = 0; i < lab.length; i++)
            avg+= (lab[i].getGe() + lab[i].getGt());

        System.out.println("Avg: " + avg / (lab.length + 1));
    }

    public static int bestStudent(Student[] lab) {
        int max = 0;

        for (int i = 0; i < lab.length; i++)
            if (max > (lab[i].getGt() + lab[i].getGe()))
                max = i;

        return max;
    }
}
