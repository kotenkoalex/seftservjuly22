package homeworks.lesson2;

import java.util.Scanner;

/**
 * Enter an integer from the console. Determine:
 * The number of digits in the number.
 * Are there more than 4 numbers in the number
 * Write the number in reverse.
 */

//Homework to Lesson 2 - 15.07.22
public class Assignment2Part2 {
    public static void main(String[] args) {
        //read number
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //print result
        System.out.println(amountOfDigits(number));
        System.out.println("Are there more than 4 numbers in the number - " + isMoreThenFour(number));
        System.out.println(reverseNumber(number));
    }

    private static int amountOfDigits(int number) {
        String str = number + "";
        return str.length();
    }

    private static boolean isMoreThenFour(int number) {
        String str = number + "";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            if (digit > '4') {
                counter++;
            }
        }
        return counter > 0;
    }

    private static String reverseNumber(int number) {
        String str = number + "";
        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            reverse.insert(0, digit);
        }
        return reverse.toString();
    }
}