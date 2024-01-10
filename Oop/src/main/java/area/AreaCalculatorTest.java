/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

/**
 *
 * @author sajeeb
 */
public class AreaCalculatorTest {
    public static void main(String[] args) {
        AreaCalculator shape = new AreaCalculator();
        System.out.println("Circle Area: "+shape.getArea(10));
        System.out.println("Triangle Area: "+shape.getArea(10,10));
        System.out.println("Rectangle Area: "+shape.getArea(10.0,10));
        System.out.println("Cylinder Area: "+shape.getArea(10.0,10.0));
        
        
    }
}
