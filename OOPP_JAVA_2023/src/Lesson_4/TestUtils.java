package Lesson_4;
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
        
        st[0] = new Student("Nikos", "Nikou", (short)100, (short)2019);
        st[1] = new Student("Maria", "Vasiliadou", (short)110, (short)2019);
        st[2] = new Student("Vasilis", "Vasiliou", (short)120, (short)2019);
        st[3] = new Student("Kostas", "Kotsou", (short)130, (short)2019);
        st[4] = new Student("Fotis", "Fotiou", (short)140, (short)2019);
        st[5] = new Student("Nikos", "Georgioy", (short)150, (short)2019);
        st[6] = new Student("Maria", "Voula", (short)160, (short)2019);
        st[7] = new Student("Vasilis", "Vasil", (short)170, (short)2019);
        st[8] = new Student("Kostas", "Kostohlou", (short)180, (short)2019);
        st[9] = new Student("Fotis", "Iliou", (short)190, (short)2019);
        
        System.out.println("Search with Last name: ");
        
        res = MyUtils.anazitisiMeEpwnymo(st, UserInput.getString());
        System.out.println("Resault: in position " + res);
        if (res != 1) 
            System.out.println(st[res]);
        else
            System.out.println("Student not found");
        
        System.out.println("Search with AM: ");
        
        res = MyUtils.anazitisiMeArMitrwou(st, UserInput.getShort());
        System.out.println("Resault: in position " + res);
        if (res != 1) 
            System.out.println(st[res]);
        else
            System.out.println("Student not found");
        
        System.out.println("Search with Binary AM: ");
               
        res = MyUtils.anadromiAnazMeArithMitrwou(st, UserInput.getShort(), 0, st.length - 1);
        System.out.println("Resault: in position " + res);
        if (res != 1) 
            System.out.println(st[res]);
        else
            System.out.println("Student not found");
        
        System.out.println();
    }
    
}
