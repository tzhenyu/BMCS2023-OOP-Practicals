// Question 2
// The Road Transport Department needs to keep track of car registrations.following information will be stored:
// ⮚ Registration number
// ⮚ Owner’s name
// ⮚ Owner’s IC number
// ⮚ The car’s plate number
// ⮚ Brand
// ⮚ Model
// ⮚ Engine capacity (e.g., 1.8L, 2.0L)
// ⮚ Color
// ⮚ Year manufactured
// For every car registered, the
// [Note: the required information to be stored has been greatly simplified to make it manageable as a practical
// exercise].
// Identify the required classes and appropriate relationships (aggregation or composition) between the classes.
// Implement all the classes and then write a driver program that will obtain input details from the user on the
// cars registered. Then, produce a listing containing the details of the car registrations. A sample listing is
// provided in the next page.
// Note: As the focus of this question is the implementation of composition and aggregation, you may simplify
// your solution as follows:
// A. Use the String type for the owner’s name.
// B. For the entity classes, you only need to implement the following:
// ⮚ A parameterized constructor to initialize all the instance variables.
// ⮚ The toString method to return all the data fields’ values as a string.
// ⮚ Automate the registration number.
// C.In your driver program,
// ⮚ You may create an array of car type objects where each object stores the information of a car type.
// This array may be created using the array initializer. Then, during user input for a car registration,
// you may display the various car types for the user to select from.
// ⮚ Use a fixed for-loop to input several registration data.
// ⮚ Assume that other than the owner’s name, the other string-typed data will only consist of a single
// word.
// ⮚ Input validations are not needed.

package oop.praactical4bq2;

/**
 *
 * @author zhenyu
 */
public class practical4bq2 {
    Car c1 = new Car("ABC123", "Blue", 2010, "Toyota", "Vios", 1.5);
}

// Class should be CAR, REGISTRATION and OWNER

class Owner {
    private String name;
    private String IC;

}

class Car {
    private String carPlate;
    private String color;
    private int year; 
    private String brand; 
    private String model;
    private double capacity;

    public Car(String carPlate, String color, int year, String brand, String model, double capacity){
        this.carPlate = carPlate;
        this.year = year;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }   
    
    void getCarPlate(String carPlate){
        this.carPlate = carPlate;
    }

    void getColor(String color) {
        this.color = color;
    }

    void getYear(int year){
        this.year = year;
    }

    void getBrand(String brand) {
        this.brand = brand;
    }

    void getModel(String model) {
        this.model = model;
    }

    void getCapacity(int capacity) {
        this.capacity = capacity;
    }
}

