/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.practical7a;

/**
 *
 * @author zhenyu
 */
public class OutpatientBill extends PatientBill {
    private static double registrationFees = 30;
    private double consultationFees;
    

    public OutpatientBill(double consultationFees, String name) {
        super(name);
        this.consultationFees = consultationFees;
    }

    @Override
    public double calculateCharges() {
        return registrationFees + consultationFees;
    }    
}

