/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical6bq1;

/**
 *
 * @author zhenyu
 */
public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(double grossSale, double commissionRate) {
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(double grossSale, double commissionRate, String name, int yearJoined, double basicSalary) {
        super(name, yearJoined, basicSalary);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    
    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCommissionEmployee{" + "grossSale=" + grossSale + ", commissionRate=" + commissionRate + '}';
    }
    
    public double calculateSalary(){
        return super.calculateSalary() + grossSale + commissionRate;
        // super.calculateSalary() means get da attribute from master 
    }
    
    public boolean equals(Employee e){
        return super.equals(e);
    }
}
