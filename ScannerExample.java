/*Write a Java program to take Employee id,name,address and salary from user and display on to 
screen */

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store employee details
        int employeeId;
        String name, address;
        double salary;

        // Take input from the user
        System.out.print("Enter Employee ID: ");
        employeeId = scanner.nextInt();  // Read employee ID (integer)

        // Consume the newline character left by nextInt()
        scanner.nextLine();  

        System.out.print("Enter Employee Name: ");
        name = scanner.nextLine();  // Read employee name (string)

        System.out.print("Enter Employee Address: ");
        address = scanner.nextLine();  // Read employee address (string)

        System.out.print("Enter Employee Salary: ");
        salary = scanner.nextDouble();  // Read employee salary (double)

        // Display the entered employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Salary: " + salary);

    }
}

/* Output

Enter Employee ID: 102
Enter Employee Name: Archana Pagul
Enter Employee Address: Solapur,Maharashtra
Enter Employee Salary:40000

Employee Details:
Employee ID: 102
Employee Name: Archana Pagul
Employee Address: Solapur,Maharashtra
Employee Salary: 40000.0
*/