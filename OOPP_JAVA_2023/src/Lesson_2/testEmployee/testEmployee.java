package Lesson_2.testEmployee;

import lesson_1.testEmployee.Employee;
import global.*;

public class testEmployee {

    public static void main(String[] args) {

        Employee[] emp;

        System.out.print("Give the number of employees: ");
        emp = new Employee[UserInput.getInteger()];

        for (int i = 0; i < emp.length; i++) {

            emp[i] = new Employee();
            System.out.println(i + " Employee");
            System.out.println("Dwse Onoma");
            emp[i].setName(UserInput.getString());
            System.out.println("Dwse Epitheto");
            emp[i].setLname(UserInput.getString());
            System.out.println("Dwse AM");
            emp[i].setAm(UserInput.getInteger());
            System.out.println("Dwse Vasiko mistho");
            emp[i].setVasikos(UserInput.getDouble());
            System.out.println("Dwse Bonus");
            emp[i].setBonus(UserInput.getDouble());
            System.out.println("Dwse Etoi Ergasias");
            emp[i].setEtoi(UserInput.getInteger());
        }

        displayStaff(emp);

    }

    public static void displayStaff(Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
}
