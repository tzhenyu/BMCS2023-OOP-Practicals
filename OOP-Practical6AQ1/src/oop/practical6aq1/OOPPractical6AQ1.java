/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.practical6aq1;

/**
 *
 * @author zhenyu
 */
public class OOPPractical6AQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Account acc1 = new Account();
        acc1.setAccno("A123");
        acc1.setBalance(500);
        System.out.println("Date created: " + acc1.getDateCreated());
        System.out.println("Account number: " + acc1.getAccno());
        System.out.println("Current balance: " + acc1.getBalance());
        
        Account acc2 = new Account("A456",200);
        System.out.println("Date created: " + acc2.getDateCreated());
        System.out.println("Account number: " + acc2.getAccno());
        System.out.println("Current balance: " + acc2.getBalance());
        
        acc2.deposit(300);
        System.out.println("Current balance: " + acc2.getBalance());
        
        
        boolean status = acc2.withdraw(501);

        System.out.println(status);
        
        if (!status) {
            System.out.println("hell nah");
        } else {
            System.out.println("Current balance: " + acc2.getBalance());

        }
        System.out.println("=============================================");
        SavingsAccount sav1 = new SavingsAccount();
        sav1.setAccno("S123");
        sav1.setBalance(600);
        
        System.out.println("Date created: " + sav1.getDateCreated());
        System.out.println("Account number: " + sav1.getAccno());
        System.out.println("Current balance: " + sav1.getBalance());
        
        
        SavingsAccount.setInterestRate(1);
        System.out.println("Interest rate: " + SavingsAccount.getInterestRate());
        sav1.deposit(300);
        System.out.println("Current balance: " + sav1.getBalance());
        
        sav1.addInterest();
        System.out.println("Interest balance: " + sav1.getBalance());

        System.out.println("=============================================");

        Account sav2 = new Account("S456",200);
        System.out.println("Date created: " + sav2.getDateCreated());
        System.out.println("Account number: " + sav2.getAccno());
        System.out.println("Current balance: " + sav2.getBalance());
        
        acc2.deposit(300);
        System.out.println("Current balance: " + sav2.getBalance());
        
        
        status = sav2.withdraw(501);

        System.out.println(status);
        
        if (!status) {
            System.out.println("hell nah");
        } else {
            System.out.println("Current balance: " + sav2.getBalance());

        }
        Account cur1 = new Account();
        cur1.setAccno("C123");
        cur1.setBalance(500);
        System.out.println("Date created: " + cur1.getDateCreated());
        System.out.println("Account number: " + cur1.getAccno());
        System.out.println("Current balance: " + cur1.getBalance());
        
    }
    
}
