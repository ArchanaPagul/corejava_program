// Parent class Person
class Person {
    // Attributes and method of the Person class
    String name;
    int age;

    public void speak() {
        System.out.println(name + " says: Hello!");
    }
}

// Child class Student that inherits from Person
class Student extends Person {
    // Attribute of Student class
    String grade;

    // Method to represent study action
    public void study() {
        System.out.println(name + " is studying for grade: " + grade);
    }
}

public class Single_Inheritance{
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student student = new Student();

        // Assigning values to attributes
        student.name = "Alice";
        student.age = 20;
        student.grade = "A";

        // Calling the speak method from the Person class
        student.speak();

        // Calling the study method from the Student class
        student.study();
    }
}
