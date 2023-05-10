package Lesson_5;

public class MyUtils {
    
    public static void insertSortAM(Student[] st) {
        for (int i = 0; i < st.length; i++) {
            short current = st[i].getAm();
            int pos = i;
             
            while ((pos > 0) && (st[pos-1].getAm() > current)) {
                st[pos].setAm(st[pos-1].getAm());
                pos--;
            }
            
            st[pos].setAm(current);
        }
        
        show(st, "Insertion Sort");
    }


    public static void selectSortEponymo(Student[] st) {
        int min;
        String temp;
        
        for (int i = 0; i < st.length; i++) {
            min = i;
            
            for (int k =i+1; k < st.length; k++)
                if (st[k].getLname().charAt(0) < st[min].getLname().charAt(0))
                   min = k;
                
                temp = st[min].getLname();
                st[min].setLname(st[i].getLname());
                st[i].setLname(temp);
            }
        
        show(st, "Selection Sort");
    }
    public static void bubbleSortEE(Student[] st) {
        int i, j;
        short temp;
        boolean flag;
        
        for (i = 1; i < st.length; i++) {
            flag = true;
            
            for (j=0; j < st.length; j++)
                if (st[j].getEtos() > st[j+1].getEtos()) {
                    temp = st[j].getEtos();
                    st[j].setEtos(st[j+1].getEtos());
                    st[j+1].setEtos(temp);
                    
                    flag = false;
                }
            
            if (flag) return;
            
        }
        
        show(st, "Bubble Sort");
    }
        
    public static void show(Student[] st, String arg) {
        for (int i =0; i < st.length; i++)
            System.out.println(st[i] + " " + arg);
    }
  
}
