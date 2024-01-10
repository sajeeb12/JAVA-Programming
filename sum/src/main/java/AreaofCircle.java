/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sajeeb
 */
import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int radius;
        System.out.println("Enter the Radius of Circle:");
        radius = scn.nextInt();
        
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The Area of the Triangle is %.2f ",area);
        
    }
}
