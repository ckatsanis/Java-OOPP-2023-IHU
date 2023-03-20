package Lesson_2.testArrays;

import global.*;
public class testArrays {

    public static void main(String[] args) {
        int array[], temp[];

        System.out.print("Give size of table: ");
        array = new int[UserInput.getInteger()];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Give the number " + i + " of " + array.length + " array point: ");
            array[i] = UserInput.getInteger();
            System.out.println();
        }

        System.out.println("The max of array is: " + array[Arrays.findMax(array)] + " on point " + Arrays.findMax(array));
        System.out.println("The Avg is: " + Arrays.findAvg(array));
        Arrays.display(array);
        System.out.println("Swapping: ");
        temp = Arrays.swap(array, 2, 3);
        Arrays.display(temp);

    }

}
