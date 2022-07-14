package homeworks.lesson1;

import java.util.Scanner;

/**
 * Output question “How are you?“.
 * Define string variable answer.
 * Read the value answer and output: “You are (answer)“.
 */

//Homework to Lesson 1 - 12.07.22
public class Assignment1Part2 {
    public static void main(String[] args) {
        System.out.println("How are you?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        System.out.println("Your answer is: " + answer);
    }
}