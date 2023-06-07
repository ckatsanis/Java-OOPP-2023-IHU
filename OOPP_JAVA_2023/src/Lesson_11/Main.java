/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_11;

import Lesson_11.Exceptions.*;
import global.UserInput;

/**
    private int childno;
    private double hourlyWage;
    private int[] overtime, workingHours;
    private String name, birthDate;
    * String name, int child, double hourlypay, String birthDate
 */
public class Main {
    public static void main(String[] args) throws IllegalArgumentException, InvalidBirthDateException, ArrayIndexOutOfBoundsException, InvalidOvertimeException {
        Employee[] emp = new Employee[5];
        
        String name;
        int child;
        double pay;
        String birthday;
                    
        for (int i = 0; i < emp.length; i++) {
            try {
                System.out.println("Dwse onoma");
                name = UserInput.getString();
                System.out.println("Dwse paidia");
                child = UserInput.getInteger();
                System.out.println("Dwse Pay");
                pay = UserInput.getDouble();
                System.out.println("Dwse Birthday");
                birthday = UserInput.getString();
                
                if (child < 0)
                    throw new IllegalArgumentException("Childs can't be negative");
                
                if ((birthday.charAt(0) < 0 && birthday.charAt(0) > 4) && 
                        (birthday.charAt(1) < 0 && birthday.charAt(1) > 9) && 
                        (birthday.charAt(2) != '/') && 
                        (birthday.charAt(3) < 0 && birthday.charAt(3) > 2) &&
                        (birthday.charAt(4) < 0 && birthday.charAt(4) > 3) &&
                        (birthday.charAt(5) != '/')) {
                    throw new InvalidBirthDateException(name + " birth date is wrong " + birthday + ". You have to\n" +
"set the birth date later");
                }
                
                emp[i] = new Employee("hey " + i, i, 10.0 + i, "10/02/202"+i);
            } catch (IllegalArgumentException ex) {
                System.out.println("Dwse paidia");
                child = UserInput.getInteger();
            } catch (InvalidBirthDateException ex) {
                System.out.println("Dwse Birthday");
                birthday = UserInput.getString();
            }
            
            try {    
                System.out.println("Give overtime for month & Overtime + working hour");
                int month = UserInput.getInteger();
                
                if ((month < 0) && (month > 12))
                        throw new ArrayIndexOutOfBoundsException();
               
                emp[i].setOverTime(month, UserInput.getInteger());
                
                int over = UserInput.getInteger();
                
                if ( (over < 0) && ( over >= 80))
                    throw new InvalidOvertimeException("Overtime cannot be negative or exceed 80\n" +
"hours. Overtime will be set to 0.");
                
                emp[i].setWorkingHours(month, over);
            } catch (ArrayIndexOutOfBoundsException ex) {
                    ex.printStackTrace();
            } catch (InvalidOvertimeException ex) {
                overtime = 0;
            }
        }
       
        
    }
}
