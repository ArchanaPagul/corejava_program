/*Write a program using exception handling to handle array index out of bounds.*/

class ExceptionEx3
{
	public static void main(String arg[])
	{
                //handling exception with try catch block 
		try
		{
			int a[]={1,2,3,4,5};       //array declaration and initialization
			System.out.println(a[5]);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


/*Output:
java.lang.ArrayIndexOutOfBoundsException: 5
*/