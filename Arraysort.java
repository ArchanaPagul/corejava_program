/*Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]   */


public class Arraysort {
    public static void main(String[] args) {
        // Initial array of integers
        int[] arr = {45, 35, 56, 67, 78, 89, 78, 12, 20};
        
        // Printing the original array
        System.out.println("Original array:");
        printArray(arr);
        
        // Bubble Sort algorithm
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = arr[j];
                    arr[j] =arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Printing the sorted array
        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Helper function to print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // New line after printing the array
    }
}


/*Output
Original array:
45 35 56 67 78 89 78 12 20 

Sorted array:
12 20 35 45 56 67 78 78 89
*/

