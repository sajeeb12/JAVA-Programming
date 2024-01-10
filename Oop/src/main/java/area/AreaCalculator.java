/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

/**
 *
 * @author sajeeb
 */
public class AreaCalculator {
    public double getArea(double radius){
        double area = Math.PI *  Math.pow(radius, 2);
        return area;
    }
    public double getArea(int length,int width){
        double area = 0.5 * length * width;
        return area;
    }
    public double getArea(double base,int height){
        double area = base * height;
        return area;
    }
    public double getArea(double radius,double height){
        double area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
        return area;
    }
}
