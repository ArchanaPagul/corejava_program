
import java.util.Scanner;
class EmployeeDetails
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//for user input

		System.out.println("Enter Employee Id: ");
		int id=sc.nextInt();//taking emp id from the user

		System.out.println("Enter Employee Name: ");
		sc.nextLine();
		String name=sc.nextLine();//taking emp name from the user

		System.out.println("Enter Employee Address: ");
		String adr=sc.nextLine();//taking emp address from the user

		System.out.println("Enter Salary of Employee: ");
		float sal=sc.nextFloat();//taking emp salary from the user
			
		//displaying employee details
		System.out.println("----Employee Details----");
		System.out.println("Employee Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+adr);
		System.out.println("Salary of Employee: "+sal);
		
	}
}

/* Output:
Enter Employee Id:
101
Enter Employee Name:
Archana Pagul
Enter Employee Address:
New Sunil Nagar, MIDC Road, Solapur
Enter Salary of Employee:
30000.5
----Employee Details----
Employee Id: 101
Name: Archana Pagul
Address: New Sunil Nagar, MIDC Road, Solapur
Salary of Employee: 30000.5
*/