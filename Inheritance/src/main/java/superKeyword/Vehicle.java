/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superKeyword;

/**
 *
 * @author sajeeb
 */
public class Vehicle {
    String color;
    double weight;
    
    
    Vehicle(String color, double weight){
        this.color = color;
        this.weight = weight;
    }
    
    void displayVehicleInfo(){
        System.out.println("Color of Vehicle: "+this.color);
        System.out.println("Weight of Vehicle: "+this.weight);
    }
}
