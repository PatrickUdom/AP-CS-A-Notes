// Question: Write a program that performs basic set operations. Implement methods to find the union, intersection, and difference of two arrays. Use these methods to demonstrate the operations with example arrays.
// Example: 
// Set 1: {1, 2, 3}
// Set 2: {3, 4, 5}
// Union: {1, 2, 3, 4, 5}
// Intersection: {3}
// Difference: {1, 2}

public class L5SetOps {
    public static void main(String[] args) {
        int[] set1 = {1, 2, 3};
        int[] set2 = {3, 4, 5};

        System.out.println("Union: ");
        printArray(union(set1, set2));
        System.out.println("Intersection: ");
        printArray(intersection(set1, set2));
        System.out.println("Difference: ");
        printArray(difference(set1, set2));
    }

    /**
     * Finds the union of two arrays.
     * @param set1 the first array
     * @param set2 the second array
     * @return the union of the two arrays
     */
    public static int[] union(int[] set1, int[] set2) {
        int[] result = new int[set1.length + set2.length];
        int index = 0;

        for (int i : set1) {
            result[index++] = i;
        }

        for (int i : set2) {
            boolean found = false;
            for (int j : set1) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = i;
            }
        }

        int[] finalResult = new int[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }

    /**
     * Finds the intersection of two arrays.
     * @param set1 the first array
     * @param set2 the second array
     * @return the intersection of the two arrays
     */
    public static int[] intersection(int[] set1, int[] set2) {
        int[] result = new int[Math.min(set1.length, set2.length)];
        int index = 0;

        for (int i : set1) {
            for (int j : set2) {
                if (i == j) {
                    result[index++] = i;
                    break;
                }
            }
        }

        int[] finalResult = new int[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }

    /**
     * Finds the difference of two arrays.
     * @param set1 the first array
     * @param set2 the second array
     * @return the difference of the two arrays
     */
    public static int[] difference(int[] set1, int[] set2) {
        int[] result = new int[set1.length];
        int index = 0;

        for (int i : set1) {
            boolean found = false;
            for (int j : set2) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = i;
            }
        }

        int[] finalResult = new int[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }

    /**
     * Prints the elements of an array.
     * @param array the array to print
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}