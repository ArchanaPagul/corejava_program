/*Write a program demonstrating multiple catch statements and finally block.*/

import java.util.Scanner;

class ExceptionEx2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in); //creating scanner object

		int a,b;

		System.out.println("Enter two numbers: ");
		a=sc.nextInt();       
		b=sc.nextInt();    //taking inputs from the user

		//handling exception with multiple catch statements
		try
		{
			int ans=a/b;      // division operation
			System.out.println("Division: "+ans);
		}
		catch(ArithmeticException e)           
		{
			System.out.println(e);
		}
		catch(NullPointerException e)           
		{
			System.out.println(e);
		}
		catch(Exception e)           
		{
			System.out.println(e);
		}
		finally                     //finally block
		{
			System.out.println("Finally block executed");
		}

	}
}

/*Output:
Enter two numbers:
12
2
Division: 6
Finally block executed

Enter two numbers:
12
0
java.lang.ArithmeticException: / by zero
Finally block executed
*/