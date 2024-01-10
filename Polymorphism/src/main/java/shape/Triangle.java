/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author sajeeb
 */
public class Triangle extends Shape{
    double base;
    double height;
    
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    double Area(){
        return (0.5 * this.base * this.height);
    }
}
