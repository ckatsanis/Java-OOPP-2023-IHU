package Lesson_5;
import global.*;

public class TestUtils {

    public static void main(String[] args) {
        Student[] st;
        int res;
        st = new Student[10];

        /*for (int i = 0; i < st.length; i++) {
            st[i] = new Student();

            System.out.println(i +" foithths");
            System.out.println("Dwse Onoma");
            st[i].setName(UserInput.getString());
            System.out.println("Dwse Epitheto");
            st[i].setLname(UserInput.getString());
            System.out.println("Dwse AM");
            st[i].setAm(UserInput.getShort());
            System.out.println("Dwse Etos");
            st[i].setEtos(UserInput.getShort());
            
        */
        
        st[0] = new Student("Nikos", "Nikou");
        System.out.println("AM:");
        st[0].setAm(UserInput.getShort());
        System.out.println("Etos:");
        st[0].setEtos(UserInput.getShort());
        
        st[1] = new Student("Maria", "Vasiliadou");
        System.out.println("AM:");
        st[1].setAm(UserInput.getShort());
        System.out.println("Etos:");
        st[1].setEtos(UserInput.getShort());
        
        st[2] = new Student("Vasilis", "Vasiliou");
        System.out.println("AM:");
        st[2].setAm(UserInput.getShort());
        System.out.println("Etos:");
        st[2].setEtos(UserInput.getShort());
        
        st[3] = new Student("Kostas", "Kotsou");
        System.out.println("AM:");
        st[3].setAm(UserInput.getShort());
        System.out.println("Etos:");
        st[3].setEtos(UserInput.getShort());        
   
        System.out.println("Insertion Sort: ");
        MyUtils.insertSortAM(st);
                
        
    }
    
}
