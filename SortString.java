/*Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B] */


public class SortString {
    public static void main(String[] args) {
        // Initialize the array of strings
        String[] arr = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

        // Print the original array
        System.out.println("Original Array: ");
        printArray(arr);

        // Bubble Sort Algorithm to sort in descending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    // Swap the elements if they are in the wrong order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array in descending order
        System.out.println("\nSorted Array in Descending Order: ");
        printArray(arr);
    }

    // Helper method to print the array
    private static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}


/*Output

Original Array: 
A X D Z Y C W B 

Sorted Array in Descending Order: 
Z Y X W D C B A 
*/
