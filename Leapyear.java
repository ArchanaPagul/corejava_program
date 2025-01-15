/* Write A Program to check leap year using if else. How to check whether a given year is leap
 year or not*/

import java.util.Scanner; // Importing the Scanner class for user input

class Leapyear {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for taking user input
        int year; // Declaring an integer variable to store the year input by the user

        System.out.println("Enter year:"); 
        year = sc.nextInt(); 

        // Checking if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
            System.out.println(year + " is a Leap year");
        } else { 
            System.out.println(year + " is not a Leap year");
        }
    }
}


/* Output

Enter year:2003
2003 is not Leap year

Enter year:2000
2000 is Leap year
*/
