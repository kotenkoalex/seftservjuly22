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

        System.out.println("a + b = " + a + " + " + b + " = " + summation(a, b));
        System.out.println("a - b = " + a + " - " + b + " = " + subtraction(a, b));
        System.out.println("a * b = " + a + " * " + b + " = " + multiplication(a, b));
        System.out.println("a / b = " + a + " / " + b + " = " + division(a, b));
    }

    /**
     * This method read integer number from console.
     *
     * @param name - take name of input variable (a or b)
     * @return - integer number
     */
    private static int readDataFromUser(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer number: " + name);
        return scanner.nextInt();
    }

    /**
     * This method makes summation
     *
     * @param a - take first number
     * @param b - take second number
     * @return - result of summation
     */
    private static int summation(int a, int b) {
        return a + b;
    }

    /**
     * This method makes subtraction
     *
     * @param a - take first number
     * @param b - take second number
     * @return - result of subtraction
     */
    private static int subtraction(int a, int b) {
        return a - b;
    }

    /**
     * This method makes multiplication
     *
     * @param a - take first number
     * @param b - take second number
     * @return - result of multiplication
     */
    private static int multiplication(int a, int b) {
        return a * b;
    }

    /**
     * This method makes division
     *
     * @param a - take first number
     * @param b - take second number
     * @return - result of division
     */
    private static int division(int a, int b) {
        int result = 0;

        //try-catch block needs for chek zero division
        try {
            result = a / b;
            return result;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Sorry, but division on 0 is forbidden");

        }
        return result;
    }

}