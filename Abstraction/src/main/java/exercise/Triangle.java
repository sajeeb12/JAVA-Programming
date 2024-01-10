/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author sajeeb
 */
public class Triangle extends Shape {
    Triangle(double a,double b){
        super(a,b);
    }
    void Area(){
        double result = 0.5 * a * b;
        System.out.println("Triangle Area: "+result);
    }
}
