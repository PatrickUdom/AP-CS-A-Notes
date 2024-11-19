// Question: Write a program that simulates rolling two six-sided dice. The program should generate two random numbers between 1 and 6 (inclusive) for each die, print the result of each die, and then print the total of the two dice.
// Example: 
// Dice 1: 3
// Dice 2: 5
// Total: 8

import java.util.Random;

public class L4RollingDice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1; // Rolling first dice
        int dice2 = random.nextInt(6) + 1; // Rolling second dice

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Total: " + (dice1 + dice2));
    }
}