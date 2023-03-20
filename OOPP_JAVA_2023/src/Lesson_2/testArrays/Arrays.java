package Lesson_2.testArrays;

public class Arrays {

    public static int findMax(int[] m) {
        int temp = 0, point = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] > temp) {
                temp = m[i];
                point = i;
            }
        }

        return point;
    }

    public static int findAvg(int[] m) {
        int avarage = 0;

        for (int i = 0; i < m.length; i++)
            avarage += m[i];

        return avarage/(m.length+1);
    }

    public static void display(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("Table data: " + m[i] + " ");
        }
    }

    public static int[] swap(int[] m, int i, int j) {
        int temp;

        temp = m[i];
        m[i] = m[j];
        m[j] = temp;

        return m;
    }

}
