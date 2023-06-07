package Lesson_11;

import lesson_1.testEmployee.*;

/*Αριθμός Μητρώου, όνομα, επώνυμο, πλήθος
απουσιών, βαθμός στο εργαστήριο, βαθμός στη θεωρία
. */

public class Employee {
    
    private int childno;
    private double hourlyWage;
    private int[] overtime = new int[12], workingHours = new int [12];
    private String name, birthDate;
       
    public Employee() {}
    
    Employee(String name, int child, double hourlypay, String birthDate) {
            this.name = name;
            this.childno = child;
            this.hourlyWage = hourlypay;
            this.birthDate = birthDate;
    }
    
    public String toString() {
        return "Name: " + name + " /nWorkHours: " + workingHours + "\nOverTime: " + overtime + "\nChild: " + childno + 
                "\nHourlyWage: " + hourlyWage + "\nBirthday: "
                + birthDate;
    }
    
    public String getName(){
        return name;
    }
        
    public double getChilds() {
        return childno;
    }
    
    public double getWage() {
        return hourlyWage;
    }
    
    public String getBirth() {
        return birthDate;
    }
    
    public int[] getOvertime() {
        return overtime;
    }
    
    public int[] getWorkingHours() {
        return workingHours;
    }
    
    public void setOverTime(int etc, int overtime) {
        this.overtime[etc] = overtime;
    }
    
    public void setWorkingHours(int etc, int hours) {
        workingHours[etc] = hours;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setChilds(int kids) {
        this.childno = kids;
    }
    
    public void setWage(double pr) {
        this.hourlyWage = pr;
    }
    
    public void setBirth(String birth) {
        this.birthDate = birth;
    }
    
    public double childBenefitFactor() throws ArithmeticException {
        try {
            if (childno == 0)
                throw new ArithmeticException("Child number cannot be negative. Child number\n" +
"will be set to 0");
            
            return (100 - (50/childno))/200d;       
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            childno = 0;
        }
        return 0;
    }
    
    public double computeMonthlyIncome(int etc) {
            return ((workingHours[etc] + overtime[etc]) * hourlyWage * (1 + childBenefitFactor()));
    }
}
