package homeworks.lesson1;

import java.util.Scanner;

/**
 * Real numbers a, b, c, d, e, f, g are given.
 * Find the area of the pentagon shown in the figure (picture "assignment1_part3_picture")
 * Angles a-b and g-c equals 90 degrees
 */

//Homework to Lesson 1 - 12.07.22
public class Assignment1Part3 {

    //a,b,c,d,e - outer sides of pentagon and g, f is inner sides
    private static double a, b, c, d, e, f, g;

    //This method read 5 outer sides, then evaluate 2 inner sides and find pentagon's area
    public static void main(String[] args) {
        readOuterPentagonSides();
        evaluateInnerPentagonSides();
        findPentagonArea();
    }

    //This method reads data from console (5 outer sides of pentagon)
    //Warning: data must be only numbers in double format
    private static void readOuterPentagonSides() {
        System.out.println("Please enter 5 outer sides of pentagon, one in line: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
    }

    //Find inner sides (evaluate 2 inner sides of pentagon)
    private static void evaluateInnerPentagonSides() {
        g = evaluateInnerSide(a, b);
        f = evaluateInnerSide(g, c);
    }

    //Find hypotenuse of right triangle (it is inner one of sides)
    private static double evaluateInnerSide(double leg1, double leg2) {
        return Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    //Find a pentagon area (sum of 3 triangles areas)
    private static void findPentagonArea() {
        double firstTriangleAria = findTriangleArea(a, b, g);
        double secondTriangleAria = findTriangleArea(g, c, f);
        double thirdTriangleAria = findTriangleArea(f, d, e);
        double pentagonArea = firstTriangleAria + secondTriangleAria + thirdTriangleAria;
        System.out.println("The aria of pentagon is equal - " + pentagonArea);
    }

    private static double findTriangleArea(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return Math.sqrt(
                perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }
}