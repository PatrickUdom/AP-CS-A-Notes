import java.util.Random;
import java.util.Scanner;

/*
Lesson 4: Iteration

Topics
4.1 while Loops Lab 2: Rolling Dice
4.2 for Loops Assignment: Matching Positions Assignment: For-loop Patterns
4.3 Developing Algorithms Using Strings
4.4 Nested Iteration Lab 3: Processing from a File
4.5 Informal Code Analysis
*/

public class L4Ieration {
    public static void main(String[] args) {
        // 4.1 while Loops
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // 4.2 for Loops
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // 4.3 Developing Algorithms Using Strings
        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index " + i + ": " + str.charAt(i));
        }

        // 4.4 Nested Iteration
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // Example: Guess the Number Game
        GuessNumberGame game = new GuessNumberGame();
        game.start();

        // Example: Reversing a String
        String reversedStr = StringReverser.reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
    }
}

/*
Example: Guess the Number Game
Description: Create a program that randomly selects a number between 1 and 10. The user has to guess the number, and the program gives hints if the guess is too high or too low. Use a do-while loop to allow repeated guesses until the user is correct.
*/

class GuessNumberGame {
    private int rand;
    private int guess;

    private Scanner scanner;
    private Random random;

    // Constructor to initialize the game
    public GuessNumberGame() {
        random = new Random();
        rand = random.nextInt(10) + 1;

        System.out.println("Guess the number (1-10): ");
        
        scanner = new Scanner(System.in);
        guess = scanner.nextInt();
    }

    // Method to start the game
    public void start() {
        while (guess != rand) {
            if (guess < rand) {
                System.out.println("Go Higher");
                guess = scanner.nextInt();
            } else {
                System.out.println("Go Lower");
                guess = scanner.nextInt();
            }
        }
        System.out.println("Correct");
    }
}

// Class for reversing a string
class StringReverser {
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}