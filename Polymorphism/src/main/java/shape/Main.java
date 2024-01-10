/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author sajeeb
 */
public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(10,20);
        
        System.out.println("Shape Area: "+s.Area());
        System.out.println("Rectangle Area: "+r.Area());
        System.out.println("Triangle Area: "+t.Area());
    }
}
