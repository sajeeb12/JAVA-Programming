/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superKeyword;

/**
 *
 * @author sajeeb
 */
public class Car extends Vehicle {
    int gear;
    
    Car(String color, double weight,int gear){
        super(color,weight);
        this.gear = gear;
    }
    
    @Override
    void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Gear of Vehicle: "+this.gear);
        
    }
}
