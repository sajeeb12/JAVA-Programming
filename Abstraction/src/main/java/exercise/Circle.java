/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author sajeeb
 */
public class Circle extends Shape {
    Circle(double a){
        super(a);
    }
    @Override
    void Area(){
        System.out.println("Circle Area: "+ Math.PI * Math.pow(a, 2));
    }
}
