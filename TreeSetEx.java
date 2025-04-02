/*Write a program using TreeSet insert Integer values and print them.*/

package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a TreeSet to store integer values
        TreeSet<Integer> ts = new TreeSet<>();

        // Adding integer values to the TreeSet
        ts.add(50);
        ts.add(20);
        ts.add(40);
        ts.add(10);
        ts.add(30);

        // Printing the elements of the TreeSet
        System.out.println("Sorted TreeSet: " );
        Iterator it=ts.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }

	}

}

/*Output:
 *Sorted TreeSet: 
10
20
30
40
50*/ 
