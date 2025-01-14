import java.util.ArrayList;

/*
Lesson 7: ArrayList

Topics
7.1 Introduction to ArrayList
7.2 ArrayList Methods
7.3 ArrayList Traversing
7.4 ArrayList Algorithms
7.5 Searching Algorithms
7.6 Sorting Algorithms

Assignment: 

*/

public class L7ArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 7.2 ArrayList Methods
        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // // Print the list
        // System.out.println(list);

        // // Remove an element
        // list.remove(2);
        // System.out.println(list);

        // // Replace an element
        // list.set(2, 10);
        // System.out.println(list);

        // // Print the element at index 2
        // System.out.println(list.get(2));

        // // Print the size of the list
        // System.out.println(list.size());

        // // Check if the list is empty
        // System.out.println(list.isEmpty());

        // 7.3 ArrayList Traversing
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // 7.4 ArrayList Algorithms
        System.out.println(list);
        // [1, 2, 3, 4, 5]
        // [1, 3, 6, 10, ]
        for (int i = 1; i < list.size(); i++) {
            list.set(i, list.get(i) + list.get(i-1));
        }
        System.out.println(list);

        // 7.5 Searching Algorithms
        // List = [a, b, c, d] linear search O(n)
        // sortedList = [2, 5, 8, 10, 12, 14, 21] binary search O(log(2)) Big O

        /* 7.6 Sorting Algorithm
        Bubble sort
        */

    }
}

class BinarySearch{
    /*
     * [-14, -7, 8 , 12, 16, 18], target 12
     * left = 0, right = 6-1 = 5
     * mid = 0+ (5-0)/2 = 5/2 => 2, arr[2] = 8
     * since 8 < 12
     * left = mid+1 = 3, right = 5
     * n^2, log_2(n)
     */

    public int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = left + (right-left) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                left = mid + 1; // Search the right half
            }
            if (arr[mid] > target){
                right = mid - 1; // Search the left half
            }
        }
        return 1; //  Element not found
    }
}

class BubbleSort{
    // Best case: O(n^2)
    // Worst case: O(n^2)
    // Average case: O(n^2)
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class InsertionSort{
    /*
     * n = 6
     * [-14, -7, 8 , 12, 18, 16], i = 1, key = -7, j = 0, arr[j] = -14
     * arr[j+1] = -7 -> -14
     * [-7, -14, 8 , 12, 18, 16], i = 1, key = -7, j = -1, arr[j] = -14
     * arr[j+1] = -7 -> -14 -> -7
     */
    /*
     * Best case: O(n)
     * Worst case: O(n^2)
     * Average case: O(n^2
     */
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}

class SelectionSort{
    /*
     * Best case: O(n^2)
     * Worst case: O(n^2)
     * Average case: O(n^2)
     */
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int minIdx = i; 
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
