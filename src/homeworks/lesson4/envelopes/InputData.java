package homeworks.lesson4.envelopes;

import java.util.Scanner;

public class InputData {
    protected static double envelopeReader() {
        Scanner console = new Scanner(System.in);
        return console.nextDouble();
    }

    protected static String exitReader() {
        System.out.println("Please enter \"y\" or \"yes\" if you want to continue");
        Scanner console = new Scanner(System.in);
        return console.next();
    }
}