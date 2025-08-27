/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop.practical7a;

/**
 *
 * @author zhenyu
 */
public abstract class PatientBill {
    private int visitId;
    private String name;
    private int lastVisitId = 101;
    public abstract double calculateCharges();
    
    public PatientBill(String name) {
        this.name = name;
        visitId = lastVisitId;
        lastVisitId++;
    }
    
    @Override
    public String toString() {
    return "";
    }
}
