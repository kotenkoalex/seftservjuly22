package homeworks.lesson1;

/**
 * Find the value of the expression where n! means the factorial of the number 3 ( n! = 1 * 2 * 3 ).
 * (2 * 5! + 3 * 8!) / (6! + 4!)
 */

//Homework to Lesson 1 - 12.07.22
public class Assignment1Part4 {
    public static void main(String[] args) {
        System.out.println(
                (2 * factorial(5) + 3 * factorial(8)) / (factorial(6) + factorial(4)));
    }

    /**
     * This method evaluate factorial
     * Notice - factorial 0 == 1
     *
     * @param value - take current value (must be positive integer)
     * @return - evaluated factorial
     */
    private static int factorial(int value) {
        int result = 1;
        for (int i = value; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}