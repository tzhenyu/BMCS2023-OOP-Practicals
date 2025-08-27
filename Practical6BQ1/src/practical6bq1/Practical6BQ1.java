/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical6bq1;

/**
 *
 * @author zhenyu
 */
public class Practical6BQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Jilly", 2021, 2500);
        Employee e2 = new Employee("Janie", 2022, 2800);
        System.out.println("Checking the names");
        System.out.println("Employee 1 has the same name as Employee 2?"+ e1.equals(e2));
        
        
        Employee[] empArray = new Employee[2];
        empArray[0] = new CommissionEmployee(2000, 0.1, "John", 2023, 3000);
        empArray[1] = new Clerk(200, 12, 5, "Jane", 2025, 2000);
        
        printElements(empArray);
        
    }
    
    public static void printElements(Employee[] e){
        for (int x = 0; x < e.length; x++) {
            if (e[x] instanceof CommissionEmployee) {
                System.out.println("Type of employee: CommissionEmployee");
            }
               else if (e[x] instanceof Clerk) {
                   
                   System.out.println("Type of employee: Clerk");
               }
            
            System.out.println(e[x]);
            System.out.println("Monthly salary: " + e[x].calculateSalary());
        
        }
    }
}
    
