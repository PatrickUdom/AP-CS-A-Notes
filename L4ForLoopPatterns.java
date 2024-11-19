// Question: Write a program that prints two patterns using nested for loops. The first pattern should be a right-angled triangle with a height of 5, and the second pattern should be an inverted right-angled triangle with a height of 5.
// Example: 
// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *

public class L4ForLoopPatterns {
    public static void main(String[] args) {
        // Pattern 1: Right-angled triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 2: Inverted right-angled triangle
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}