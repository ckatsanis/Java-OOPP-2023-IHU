package Lesson_3;
import global.*;
public class Recursion {

    public static void palindrome() {
        int num, origNum, reverse = 0, remainder;

        System.out.println("Give between 1 - 5 numbers");
        num = UserInput.getInteger();
        origNum = num;

        while (num != 0 && (num >= 1 && num <= 99999)) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        if (origNum == reverse)
            System.out.println("The " + reverse + " is palindrome!");
        else
            System.out.println("The " + reverse + " is not palindrome!");

    }

    public static void stringPalindrome() {
        String str, reverseStr = "";
        int lenght = 0;

        System.out.println("Give a String!");
        str = UserInput.getString();
        lenght = str.length();

        for (int i = (lenght - 1); i >=0; --i ) {
            reverseStr += str.charAt(i);
        }

        if (reverseStr.equals(str))
            System.out.println("The " + reverseStr + " is palindrome!");
        else
            System.out.println("The " + reverseStr + " is not palindrome!");
    }

    public static void firstNumber() {

        for (int i = 1; i < 10000; i++) {
            if (i % 2 == 1)
                System.out.println("Number " + i +" is first!");
            else
                System.out.println("Number " + i +" is not first!");
        }
    }

    public static void hanoi(int disks, int point, int dest, int temp) {

        if (disks == 1) {
            System.out.println("Disk move 1 from " + point + " to " + dest);
            return;
        }

        hanoi(disks - 1, point, temp, dest);
        System.out.println("Disk move " + disks + " from " + point + " to " + dest);
        hanoi(disks - 1, temp, dest, point);

    }

}
