// Question: Write a program that includes functions to check the parity (even or odd) of a number. Implement methods to check if a number is even and if a number is odd. Use these methods to print the parity of numbers from 1 to 10.
// Example: 
// 1 is odd.
// 2 is even.
// 3 is odd.
// 4 is even.
// 5 is odd.
// 6 is even.
// 7 is odd.
// 8 is even.
// 9 is odd.
// 10 is even.

public class L5ParityFunctions {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (isEven(i)) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
    }

    /**
     * Checks if a number is even.
     * @param number the number to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Checks if a number is odd.
     * @param number the number to check
     * @return true if the number is odd, false otherwise
     */
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}