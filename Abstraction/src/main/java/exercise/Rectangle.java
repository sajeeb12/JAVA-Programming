/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author sajeeb
 */
public class Rectangle extends Shape {
    Rectangle(double a,double b){
        super(a,b);
    }
    
    @Override
    void Area(){
        double result = a * b;
        System.out.println("Rectangle Area: "+result);
    }
}
