package Lesson_4;

public class MyUtils {
    
    public static int anazitisiMeEpwnymo(Student[] st, String eponimo) {
        for (int i = 0; i < st.length; i++) 
            if (st[i].getLname().equals(eponimo)) 
                return i;
        
        return -1;
    }
    
    public static int anazitisiMeArMitrwou(Student[] st, Short am) {
        int pos = -1, mid, start, end;
        start = 0;
        end = st.length -1;    
        
        while ( pos == -1 && start <= end ) {
            mid = (start + end) / 2;
            
            if (st[mid].getAm() < am)
                start = mid + 1;
            else if (st[mid].getAm() > am)
                end = mid - 1;
            else if (st[mid].getAm() == am)
                pos = mid;
            else 
                return -1;
        }
                    
        return pos;
    }

    public static int anadromiAnazMeArithMitrwou(Student[] st, Short am, int start, int end) {
        if (start > end)
            return -1;
        
        int mid = (start + end) / 2;;
        
        if (st[mid].getAm() < am)
            return anadromiAnazMeArithMitrwou(st, am, mid + 1, end);
        else if (st[mid].getAm() > am)
            return anadromiAnazMeArithMitrwou(st, am, start, mid - 1);
        else 
            return mid;
    }
}
