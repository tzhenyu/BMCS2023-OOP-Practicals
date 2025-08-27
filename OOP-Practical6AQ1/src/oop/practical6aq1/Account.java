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
public class Account {
    private String accno;
    private double balance;
    private Date dateCreated;

    public Account(String accno, double balance) {
        this.accno = accno;
        this.balance = balance;
        dateCreated = new Date();
    }
    
    public Account(){
        dateCreated = new Date();
        
    };

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getAccno() {
        return accno;
    }

    public double getBalance() {
        return balance;
        
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public boolean withdraw(double amount){
        if (amount > balance) {
            return false;
        } 
        
        balance -= amount;
        return true;
    }
    
    
    
    
    
}
