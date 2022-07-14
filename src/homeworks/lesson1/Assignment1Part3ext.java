package homeworks.lesson1;


import java.util.Scanner;

/**
 * Real numbers a, b, c, d, e, f, g are given.
 * Find the area of the pentagon shown in the figure (picture "assignment1_part3_picture")
 */

//Homework to Lesson 1 - 12.07.22
public class Assignment1Part3ext {

    //read 7 sides from console
    public static final int SIDES = 7;

    public static void main(String[] args) {

        //first triangle has: a,b,g sides - 0, 1, 2 array elements
        //second triangle has: g,c,f sides - 2, 3, 4 array elements
        //third triangle has: f,d,e sides - 4, 5, 6 array elements
        System.out.println("Please enter 7 sides of pentagon, one in line: ");
        double[] sidesArray = new double[SIDES];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sidesArray.length; i++) {
            sidesArray[i] = scanner.nextDouble();
        }

        //check if each triangle exists
        boolean firstTriangleExist = checkIfTriangleExist(sidesArray[0], sidesArray[1], sidesArray[2]);
        boolean secondTriangleExist = checkIfTriangleExist(sidesArray[2], sidesArray[3], sidesArray[4]);
        boolean thirdTriangleExist = checkIfTriangleExist(sidesArray[4], sidesArray[5], sidesArray[6]);

        //find pentagon area
        if (firstTriangleExist == secondTriangleExist == thirdTriangleExist) {
            double firstTriangleAria = findTriangleArea(sidesArray[0], sidesArray[1], sidesArray[2]);
            double secondTriangleAria = findTriangleArea(sidesArray[2], sidesArray[3], sidesArray[4]);
            double thirdTriangleAria = findTriangleArea(sidesArray[4], sidesArray[5], sidesArray[6]);
            double pentagonArea = firstTriangleAria + secondTriangleAria + thirdTriangleAria;
            System.out.println("The aria of pentagon is equal - " + pentagonArea);
        } else {
            System.out.println("Sorry but one of triangles can't exists");
        }

    }

    /**
     * This method checks if triangle exist
     * Triangle exists if the sum of every two sides is greater than the third side
     *
     * @param side1 - take first side of triangle
     * @param side2 - take second side of triangle
     * @param side3 - take third side of triangle
     * @return true if triangle exist, false if not
     */
    private static boolean checkIfTriangleExist(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    /**
     * This method evaluate triangles aria
     * Heron's formula for the area of triangle on three sides S = √p(p - a)(p - b)(p - c)
     *
     * @param side1 - take first side of triangle
     * @param side2 - take second side of triangle
     * @param side3 - take third side of triangle
     * @return - evaluated triangles aria
     */
    private static double findTriangleArea(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return Math.sqrt(
                perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }

}