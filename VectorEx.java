/* Write a program using Vector to store the list of students details and print the details. */

package collection;

import java.util.Vector;
import java.util.Iterator;

class Student1 {
    String name;
    int rollNumber;
    String department;

    public Student1(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void display() {
        System.out.println(name + "  " + rollNumber + "  " + department);
    }
}

public class VectorEx {
    public static void main(String[] args) {
        Vector<Student1> studentList = new Vector<>();

        // Adding students to the Vector
        studentList.add(new Student1("Archana Sargam", 22, "CSE"));
        studentList.add(new Student1("Archana pagul", 23, "ECE"));
        studentList.add(new Student1("Krushnaveni Mhaisal", 21, "IT"));
        studentList.add(new Student1("Lavanya Pola", 18, "CSE "));

        // Displaying student details using Iterator
        System.out.println("Student Details:");
        Iterator<Student1> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }
}

/*Output:
 * Student Details:
Archana Sargam  22  CSE
Archana pagul  23  ECE
Krushnaveni Mhaisal  21  IT
Lavanya Pola  18  CSE */
