// A. Given the Employee class as below:

/* public class Employee{
 String name;
 double salary;
 Employee(String employeeName, double currentSalary){
 name = employeeName;
 salary = currentSalary;
 }
 void raiseSalary(double percent){
 salary = salary + (salary * percent / 100.0);
 }
 }  */

// Write a driver program that creates an Employee object and displays his/her salary before and after a
// salary raise of 8%.

// B.(Access modifiers) Modify the Employee class such that data field encapsulation is applied and the
// correct visibility modifiers are used. Specifically,

// ⮚ Make the data fields private.
// ⮚ Implement setters and getters for each data field.
// ⮚ All constructors and methods should be declared as public.

// Modify your previous driver program accordingly.

// C.(Constructors and constructor overloading) Add the following constructors to the Employee class.
// ⮚ A no-argument constructor that sets the employee name to an empty string (i.e., “”) and the salary
// field to 0.0.
// ⮚ A constructor with 1 parameter. This constructor receives a String argument storing a name. The
// salary field should be set to 0.0.
// Implement a driver program that creates 2 Employee objects each using a different constructor above.
// Include statements to:
// ⮚ Display the employee with a higher salary
// ⮚ Compute and display the total salary of the 2 employees

package oop.praactical4aq2;

/**
 *
 * @author zhenyu
 */
public class OOPPraactical4AQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Question A
        Employee e1 = new Employee("Ali", 2500);
        Employee e2 = new Employee("Abu");
        Employee e3 = new Employee();

        System.out.println("The salary of " + e1.getName() + " before the raise is RM" + e1.getSalary() + ".");

        e1.raiseSalary(8);

        System.out.println("The salary of " + e1.getName() + "after the raise is RM" + e1.getSalary() + ".");

        // Set name and salary for e2 and e3
        e2.setSalary(1500);

        e3.setName("Ahmad");
        e3.setSalary(1700);

        // Display employee with higher slary
        if (e2.getSalary() > e3.getSalary()) {
            System.out.println(e2.getName() + " has higher salary.");
        } else {
            System.out.println(e3.getName() + " has higher salary.");
        }

        // display total salary
        System.out.println("The total salary of the 2 employees are: " + (e2.getSalary() + e3.getSalary() + "."));
    }

}

class Employee {
    // Make data field private;
    private String name;
    private double salary;

    // Create constructor with no argument
    Employee() {
        name = "";
        salary = 0.0;
    }

    // Create constructor with 1 parameter
    Employee(String employeeName) {
        name = employeeName;
        salary = 0.0;
    }

    Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }

    // getter
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}