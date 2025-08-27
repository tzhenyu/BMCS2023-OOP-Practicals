
/* 
A. Create a class named Student that includes data fields for the student ID, name, number of quizzes
taken and a total quiz score. In your class, include the following:
⮚ A no-arg constructor
⮚ A constructor with 2 parameters for student ID and name
⮚ accessors for all data fields
⮚ appropriate mutators
⮚ addQuiz(int score) [each quiz is worth 10 marks]
⮚ getAverageScore()

IMPORTANT NOTE: Remember to adhere to the standard Java naming convention for your class
names, data field names and method names.

B. Create a driver program that tests all constructors and methods.
*/

package oop.praactical4aq3;

/**
 *
 * @author zhenyu
 */
public class OOPPraactical4AQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student(1, "Ali");

        s1.addQuiz(12);
        s1.addQuiz(7);
        s1.addQuiz(3);
        s1.addQuiz(-5);

        System.out.println("The average score of " + s1.getName() + " is " + s1.getAverageScore());

    }

}

class Student {

    private int studentID;
    private String studentName;
    private int numOfQuiz;
    private int totalScore;

    // no-arg constructor
    Student() {
        numOfQuiz = 0;
    };

    // costructor for studentid and name
    Student(int id, String name) {
        studentID = id;
        studentName = name;
        numOfQuiz = 0;
        totalScore = 0;

    };

    // Setter are mutators
    public void setID(int id) {
        this.studentID = id;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    // Getter are accessor
    public int getID() {
        return studentID;
    }

    public String getName() {
        return studentName;
    }

    // add quiz method
    void addQuiz(int score) {
        if (score > 10) {
            System.out.println(score + " too high, ignoring");
        } else if (score < 0) {
            System.out.println("how do you get " + score + "? ignoring");
        } else {
            numOfQuiz++;
            totalScore = totalScore + score;
        }

    }

    // average score method
    double getAverageScore() {
        if (numOfQuiz == 0) {
            return 0;
        }
        return (double) totalScore / numOfQuiz;
    }
}