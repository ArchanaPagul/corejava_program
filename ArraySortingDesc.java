/* Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B] */

package arrayPrograms;

public class ArraySortingDesc {

	public static void main(String[] args) {

		char ch[]= {'A','X','D','Z','Y','C','W','B'};  //array declaration and initialization

		//sorting the array elements in an descending order
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length-1;j++)
			{
				if(ch[j]<ch[j+1])
				{
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;

				}
			}
		}


		//Traversing the sorted array and displaying the elements
		System.out.println("After sorting the array elements are: ");
		
		for(char i:ch)
		{
			System.out.print(i+" ");
		}


	}

}


/* Output:
 * After sorting the array elements are: 
 * Z Y X W D C B A 
 */
