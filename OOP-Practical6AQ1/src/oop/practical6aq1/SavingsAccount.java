/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.practical6aq1;

/**
 *
 * @author zhenyu
 */
public class SavingsAccount extends Account {
    private static double interestRate = 0.03;

    public SavingsAccount(String accno, double balance) {
        super(accno, balance);
    }
    
    public SavingsAccount(){
        
    }
    
    public double calculateInterest() {
        return getBalance() * (interestRate / 12);

    }
    
    public static double  getInterestRate(){
        return interestRate * 100;
    }
    
    public void addInterest(){
        double interest = calculateInterest();
        deposit(interest);
    }
    
    public static void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    
}
