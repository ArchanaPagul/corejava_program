/*Write a Program to find Perimeter of a Square*/

import java.util.Scanner;
public class SquarePerimeter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the length of the side of the square
        System.out.print("Enter the length of the side of the square: ");
        double side = scanner.nextDouble();  // Read the side length as a double

        // Calculate the perimeter of the square using the formula: Perimeter = 4 * side
        double perimeter = 4 * side;

        // Output the result
        System.out.println("The perimeter of the square is: " + perimeter);

    }
}


/*Output

Enter the length of the side of the square: 6
The perimeter of the square is: 24.0         
*/