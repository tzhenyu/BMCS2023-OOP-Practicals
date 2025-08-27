// A. (Using the this keyword) Modify the Student class from Practical #4A’s Question 3 based on the
// following:
// ⮚ In the parameterized constructor and set methods, the parameters have the same name as the
// corresponding data field.
// ⮚ The no-arg constructor will invoke the parameterized constructor
// B. (Using static variables and methods) Suppose your tutor wants the contribution of quizzes to the
// coursework mark be stored in the Student class and this value may be revised in other semesters.
// Modify the Student class accordingly.
// C.Modify the driver program in Practical #4A’s Question 3 to include the following:
// ⮚ Set a value of 20% for the contribution of quizzes to the coursework mark
// ⮚ Calculate and display the quiz marks (out of 20 marks) obtained by each student

//NOT DONE YET

package oop.praactical4bq1;

/**
 *
 * @author zhenyu
 */
public class OOPPraactical4BQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Ali",18);

    }


}
    class Student { 
        private String name; 
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Student() {
            this.age = 0;
            this.name = "";
        }
        
        // setter
        void setName(String name) {
            this.name = name;
        }

        void setAge(int age) {
            this.age = age;
        }

    }
    