/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.practical6aq1;

import java.util.Date;

/**
 *
 * @author zhenyu
 */
public class CurrentAccount extends Account{
    
    private static int freeTransaction = 3;
    private static double transactionFee = 0.5;
    private int transactionCount;
    
    public CurrentAccount(String accno, double balance) {
        super(accno, balance);
        transactionCount = 0;
    }


    public CurrentAccount() {
        transactionCount = 0;
    }
    
    
    public void increment(){
        transactionCount += 1;
    }
    
    public void deductTransactionFee(){
        withdraw(transactionFee);
    }

    public static double getTransactionFee() {
        return transactionFee;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
    

}
