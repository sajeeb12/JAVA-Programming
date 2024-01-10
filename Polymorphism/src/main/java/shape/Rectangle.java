/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author sajeeb
 */
public class Rectangle extends Shape {
    double length ;
    double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double Area(){
        return this.length * this.width;
    }
}
