package Lesson_2.testStudent;

import global.UserInput;
import lesson_1.teststudent.Student;

public class TestStudentLab {

    public static void main(String[] args) {
        Student[] st;

        System.out.print("Give number of Students: ");
        st = new Student[UserInput.getInteger()];

        for (int i = 0; i < st.length; i++) {
            st[i] = new Student();

            System.out.println(i +" foithths");
            System.out.println("Dwse Onoma");
            st[i].setName(UserInput.getString());
            System.out.println("Dwse Epitheto");
            st[i].setLname(UserInput.getString());
            System.out.println("Dwse AM");
            st[i].setAm(UserInput.getInteger());
            System.out.println("Dwse Apousies");
            st[i].setApousies(UserInput.getInteger());
            System.out.println("Dwse Vathmo Ergasthriou");
            st[i].setGe(UserInput.getDouble());
            System.out.println("Dwse Vathmo Theorias");
            st[i].setGt(UserInput.getDouble());
        }

        StudentLab lab = new StudentLab(st);
        lab.avgStudents();
        lab.passed();
        System.out.println(st[lab.bestStudent()]);
    }
}
