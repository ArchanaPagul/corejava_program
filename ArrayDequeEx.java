/*Write a program using ArrayDeque to add book names and add,delete the values from both ends of que */

package collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeEx 
{
    public static void main(String[] args) 
    {
        // Creating an ArrayDeque to store book names
        ArrayDeque<String> bq = new ArrayDeque<>();

        // Adding books to both ends
        bq.addFirst("Java");
        bq.add("Python");
        bq.add("HCI");
        bq.addFirst("Machine Learning");
        bq.addLast("DBMS");

        // Displaying the books
        System.out.println("Books in Queue: "+bq);
        

        // Removing books from both ends
        System.out.println("Removed from front: " + bq.removeFirst());
        System.out.println("Removed from rear: " + bq.removeLast());

        // Displaying the books after deletion
        System.out.println("Books in Queue after deletion: "+bq);
    }
}


/*Output:
 * Books in Queue: 
Machine Learning
Java
Web Development
Aritficial Intelligence
DBMS
Python
Removed from front: Machine Learning
Removed from rear: Python
Books in Queue after deletion: 
Java
Web Development
Aritficial Intelligence
DBMS*/
 

