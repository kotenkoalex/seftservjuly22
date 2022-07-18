package homeworks.lesson1;

import java.util.Scanner;

/**
 * Define integer variables a and b. Read values a and b from Console and calculate:
 * a + b
 * a - b
 * a * b
 * a / b
 * Output obtained results.
 */

//Homework to Lesson 1 - 12.07.22
public class Assignment1Part1 {
    public static void main(String[] args) {

        int a = readDataFromUser("a");
        int b = readDataFromUser("b");

        printResult(a, b);
    }

    private static void printResult(int a, int b) {
        System.out.println("a + b = " + a + " + " + b + " = " + summation(a, b));
        System.out.println("a - b = " + a + " - " + b + " = " + subtraction(a, b));
        System.out.println("a * b = " + a + " * " + b + " = " + multiplication(a, b));
        if (b > 0) {
            System.out.println("a / b = " + a + " / " + b + " = " + division(a, b));
        } else {
            System.out.println("a / b = " + a + " / " + b + " - provides division by zero");
        }
    }

    private static int readDataFromUser(String name) {
        Scanner scanner = new Scanner(System.in);
        boolean isEnter = false;
        int result = 0;
        while (!isEnter) {
            System.out.println("Please input integer number: " + name);
            String line = scanner.nextLine();
            try {
                result = Integer.parseInt(line);
                isEnter = true;
            } catch (NumberFormatException e) {
                System.out.print("Wrong data. ");
            }
        }
        return result;
    }

    private static int summation(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }

    private static int multiplication(int a, int b) {
        return a * b;
    }

    private static int division(int a, int b) {
        return a / b;
    }
}