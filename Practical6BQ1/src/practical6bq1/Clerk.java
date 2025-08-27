/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical6bq1;

/**
 *
 * @author zhenyu
 */
public class Clerk extends Employee {
    private double allowance;
    private int overtimeHours;
    private double overtimeRate;

    public Clerk(){
        
    }
    
    public Clerk(double allowance, int overtimeHours, double overtimeRate, String name, int yearJoined, double basicSalary) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }
    
    

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public String toString() {
        return "Clerk{" + "allowance=" + allowance + ", overtimeHours=" + overtimeHours + ", overtimeRate=" + overtimeRate + '}';
    }
    
    public double calculateSalary(){
        return super.calculateSalary() + allowance + (overtimeHours * overtimeRate);
        
    }
    
    public boolean equals(Employee e){
        return super.equals(e);
    }    
}
