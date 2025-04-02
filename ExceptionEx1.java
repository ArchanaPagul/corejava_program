/*Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.*/

import java.util.Scanner;

class ExceptionEx1
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in); //creating scanner object

		int a,b;

		System.out.println("Enter two numbers: ");
		a=sc.nextInt();       
		b=sc.nextInt();    //taking inputs from the user

		//handling exception
		try
		{
			int ans=a/b;      // division operation
			System.out.println("Division: "+ans);
		}
		catch(ArithmeticException e)           
		{
			System.out.println(e);
		}
	}
}

/*Output:
Enter two numbers:
15
3
Division: 5

Enter two numbers:
12
0
java.lang.ArithmeticException: / by zero

*/