/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author sajeeb
 */
abstract public class Shape {
    double a;
    double b;
    Shape(double a){
        this.a = a;
    }
    Shape(double a,double b){
        this.a = a;
        this.b = b;
    }
    abstract void Area();
}
