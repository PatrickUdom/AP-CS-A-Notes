/*
Lesson 6: Array

Topics
6.1 Array Creation and Access
6.2 Traversing Arrays
6.3 Enhanced for Loop for Arrays
6.4 Developing Algorithms Using Arrays

Assignment: 
*/

public class L6Array {
    public static void main(String[] args){
        // 6.1 Array Creation and Access
        int[] numbers = {1, 2, 3, 4, 5};

        // 6.2 Traversing Arrays
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 6.3 Enhanced for Loop for Arrays
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6.4 Developing Algorithms Using Arrays
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}

// Class for finding the maximum value in an array
class MaxValueFinder {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

// Class for reversing an array
class ArrayReverser {
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
