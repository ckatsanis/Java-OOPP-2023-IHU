package Lesson_6;

public class MyUtils {
    
    public static void sort(Student[] st) {
        qSort(st, 0, st.length-1);
        
        show(st, "Quick Sort");
    }
    
    public static void qSort(Student[] st, int f, int l) {
        if (l - f > 0) {
            int pivIn = partition(st, f, l);
            qSort(st, f, pivIn - 1);
            qSort(st, pivIn + 1, l);
        }        
    }
    
    public static int partition(Student[] st, int f, int l) {
        int ret = 0;
        int low = f;
        int mid = (f+l)/2;
        swap(st, f, mid);
        int pivot = st[f].getAm();
        f++;
        
        while (f < 1) {
            while (st[f].getAm() <= pivot && f < 1)
                f++;
            
            while (st[l].getAm() >= pivot && f <= 1)
                l--;
            
            if (f < 1) 
                swap(st, f, l);
        }
        
        if ( pivot > st[f].getAm()) {
            swap(st, f, low);
            ret = f;
        } else {
            if ( pivot >= st[l].getAm()) {
                swap(st, l ,low);
                ret = l;
            }
        }
        
        return ret;
    } 
        
    public static void swap(Student[] st, int f, int l) {
        
       short temp = st[f].getAm();
       st[f].setAm(st[l].getAm());
       st[l].setAm(temp);
        
    }
    
    public static void mergeSortEponymo(Student[] st) {
        mSort(st, 0, st.length-1);
        
        show(st, "Merge");
    }
    
    public static void mSort(Student st[], int f, int l) {
        if (f == 1) return;
        
        int mid = (f+l)/2;
        mSort(st, f, mid);
        mSort(st, mid+1, l);
        //merge(st, f, l, mid);
    }
    
    /*public static void merge(Student[] st, int a, int b) {
        int i1 = 0, i2 = 0, j = 0;
        
        while (i1 <= st.length && i2 <= a) {
            if (st[i1].getLname().charAt(0))
        }
    }*/
    
    public static void show(Student[] st, String arg) {
        for (int i =0; i < st.length; i++)
            System.out.println(st[i] + " " + arg);
    }
  
}
