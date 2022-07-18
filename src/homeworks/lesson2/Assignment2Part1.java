package homeworks.lesson2;

import java.util.Scanner;

/**
 * The operation of the traffic light for pedestrians is programmed as follows:
 * at the beginning of each hour, a green signal is lit for three minutes,
 * then red for two minutes, green again for three minutes, etc.
 * An integer t is given, which means the time in minutes
 * that has passed since the start of the next hours
 * Determine which color signal is lit for pedestrians at this moment
 */

//Homework to Lesson 2 - 15.07.22
public class Assignment2Part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            int redCounter = 0;
            int greenCounter = 0;
            while (t > 0) {
                t = t - 3;
                greenCounter++;
                if (t > 0) {
                    t = t - 2;
                    redCounter++;
                }
            }
            System.out.println(greenCounter > redCounter ? "Green" : "Red");
        }
    }
}