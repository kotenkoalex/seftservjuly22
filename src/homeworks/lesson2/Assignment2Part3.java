package homeworks.lesson2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create a one-dimensional array A of n elements (n is a multiple of 4).
 * Fill it with random integers in the range from [a,b). Determine:
 * Task1: Maximum and minimum values, their indices;
 * Task2: The arithmetic mean of the elements of the second half of the array;
 * Task3: Rearrange the elements of 1 and 3 quarters.
 * Task4: Create arrays B and C. Write to array B elements of array A that are even, to array C - odd in value.
 */

//Homework to Lesson 2 - 15.07.22
@SuppressWarnings("SameParameterValue")
public class Assignment2Part3 {

    //set n - length of array A (n is a multiple of 4).
    private static final int n = 12;

    //set a and b - range [a,b) for filling array with random integers
    private static final int a = 0;
    private static final int b = 10;

    public static void main(String[] args) {

        //create, fill and print current array
        int[] A = fillArray(n, a, b);
        System.out.println("******* Current array A *******" + "\n" + Arrays.toString(A) + "\n");

        //print results of: Task 1, Task 2, Task 3, Task 4
        printResult(A);
    }

    private static int[] fillArray(int n, int a, int b) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (a + Math.random() * b);
        }
        return array;
    }

    private static void printResult(int[] array) {
        System.out.println("******* Task 1 *******");
        System.out.print("min = " + arrayMinValue(array) + ", ");
        System.out.println("index(es) of min - " + findIndexes(array, arrayMinValue(array)));
        System.out.print("max = " + arrayMaxValue(array) + ", ");
        System.out.println("index(es) of max - " + findIndexes(array, arrayMaxValue(array)) + "\n");

        System.out.println("******* Task 2 *******");
        System.out.println("arithmetic mean of the second half of the array = " + arithmeticMeanOfSecondHalfArray(array) + "\n");

        System.out.println("******* Task 3 *******");
        System.out.println("rearrange 1 and 3 quarters - " + Arrays.toString(rearrangeElementsFirstAndThirdQuarters(array)) + "\n");

        System.out.println("******* Task 4 *******");
        evenAndOddArrays(array);
    }

    private static int arrayMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    private static String findIndexes(int[] array, int element) {
        StringBuilder indexes = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                indexes.append(i).append(", ");
            }
        }
        return indexes.substring(0, indexes.length() - 2);
    }

    private static int arrayMaxValue(int[] array) {
        int max = -Integer.MAX_VALUE;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    private static int arithmeticMeanOfSecondHalfArray(int[] array) {
        int[] secondHalfArray = Arrays.copyOfRange(array, array.length / 2, array.length);
        int secondHalfArraySum = 0;
        for (int element : secondHalfArray) {
            secondHalfArraySum += element;
        }
        return secondHalfArraySum / secondHalfArray.length;
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int[] rearrangeElementsFirstAndThirdQuarters(int[] array) {
        //separate array to 4 quarter
        int[] firstQuarterArray = Arrays.copyOfRange(array, 0, array.length / 4);
        int[] secondQuarterArray = Arrays.copyOfRange(array, array.length / 4, (array.length / 4) * 2);
        int[] thirdQuarterArray = Arrays.copyOfRange(array, (array.length / 4) * 2, (array.length / 4) * 3);
        int[] fourthQuarterArray = Arrays.copyOfRange(array, (array.length / 4) * 3, array.length);

        int[] rearrangeElements = new int[array.length];

        //swap the first and third quarters and assemble new array (rearrangeElements) together
        for (int i = 0; i < thirdQuarterArray.length; i++) {
            rearrangeElements[i] = thirdQuarterArray[i];
        }
        for (int i = 0; i < secondQuarterArray.length; i++) {
            rearrangeElements[i + firstQuarterArray.length] = secondQuarterArray[i];
        }
        for (int i = 0; i < firstQuarterArray.length; i++) {
            rearrangeElements[i + thirdQuarterArray.length + secondQuarterArray.length] = firstQuarterArray[i];
        }
        for (int i = 0; i < fourthQuarterArray.length; i++) {
            rearrangeElements[i + thirdQuarterArray.length + secondQuarterArray.length + firstQuarterArray.length] = fourthQuarterArray[i];
        }

        return rearrangeElements;
    }

    private static void evenAndOddArrays(int[] array) {
        //crate arrays temporarilyB (for even elements) and temporarilyC (for odd elements)
        ArrayList<Integer> temporarilyB = new ArrayList<>();
        ArrayList<Integer> temporarilyC = new ArrayList<>();

        //fill array temporarilyB
        for (int element : array) {
            if (element % 2 == 0) {
                temporarilyB.add(element);
            } else {
                temporarilyC.add(element);
            }
        }

        int[] B = new int[temporarilyB.size()];
        for (int i = 0; i < B.length; i++) {
            B[i] = temporarilyB.get(i);
        }

        int[] C = new int[temporarilyC.size()];
        for (int i = 0; i < C.length; i++) {
            C[i] = temporarilyC.get(i);
        }

        System.out.println("temporarilyB (even elements from array A): " + Arrays.toString(B));
        System.out.println("temporarilyC (odd elements from array A): " + Arrays.toString(C));
    }
}