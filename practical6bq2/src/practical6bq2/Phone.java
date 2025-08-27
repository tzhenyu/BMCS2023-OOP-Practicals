/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical6bq2;

/**
 *
 * @author zhenyu
 */
public class Phone {
    final static double CHARGE = 300;
    private double price;
    private String brand;

    public Phone(double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    
    public double monthlyInstalment(double price, int month) {
        return (price+CHARGE)/month;
    }
}

