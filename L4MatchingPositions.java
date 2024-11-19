// Question: Write a program that compares two strings of the same length and prints the positions and characters where they match. The program should iterate through each character of the strings and check if they are the same at each position.
// Example: 
// str1 = "hello"
// str2 = "hxllo"
// Matching character at position 0: h
// Matching character at position 2: l
// Matching character at position 3: l

public class L4MatchingPositions {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hxllo";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                System.out.println("Matching character at position " + i + ": " + str1.charAt(i));
            }
        }
    }
}