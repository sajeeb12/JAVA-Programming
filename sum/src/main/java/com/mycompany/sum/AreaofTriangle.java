/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sum;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class AreaofTriangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        double base, height;
        System.out.print("Enter the Base of Triangle:");
        base = scn.nextDouble();
        System.out.print("Enter the Height of Triangle:");
        height = scn.nextDouble();
        
        double areaOfTriangle = 0.5 * base *height;
        
        System.out.printf("Area of Triangle: %.2f",areaOfTriangle);
        
    }
    
}
