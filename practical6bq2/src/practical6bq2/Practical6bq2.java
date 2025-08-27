/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical6bq2;

/**
 *
 * @author zhenyu
 */
public class Practical6bq2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phone p1 = new Phone(3200,"Huawei");
        
        System.out.println("Monthly instalment: RM" + p1.monthlyInstalment(p1.getPrice(), 2));
    }
    
}

