// A. Create a class named Student with the following:
// • Two attributes: String name and int age.
// • A method called displayDetails() that prints the student's name and age.

// B.Write a driver program (Main class) to perform the following:
// • Create one object of the Student class.
// • Call the displayDetails() method to show the student’s information.

package oop.praactical4aq1;

/**
 *
 * @author zhenyu
 */
public class OOPPraactical4AQ1 {

    /**
     * @param args the command line arguments
     */
    // QUESTION B
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ali";
        s1.age = 15;

        s1.displayDetails();
    }

}

// QESTION A
class Student {
    String name;
    int age;

    void displayDetails() {
        System.out.println(name + " " + age);
    }

}