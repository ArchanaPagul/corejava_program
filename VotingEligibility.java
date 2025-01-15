/*Write java program to check candidate eligible for voting or not.*/


import java.util.Scanner; // Importing the Scanner class for user input

class VotingEligibility { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        System.out.println("Enter your age:"); 
        int age = sc.nextInt(); 

        // Check if the user is eligible for voting
        if (age >18) { 
            System.out.println("You are eligible to vote.");
        } else { 
            System.out.println("You are not eligible to vote.");
        }
    }
}

/*Output 

Enter your age: 20
You are eligible to vote.

Enter your age: 16
You are not eligible to vote.
*/






