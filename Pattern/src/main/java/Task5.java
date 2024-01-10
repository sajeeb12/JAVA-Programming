/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of products: ");
        int n = scn.nextInt();
        double[] price = new double[n];
        double[] quantity = new double[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.printf("\nEnter Price & Quantity of Product %d: ",(i+1));
            price[i] = scn.nextDouble();
            quantity[i] = scn.nextDouble();  
        }
        System.out.println("Money Reciept");
        System.out.println("-----------------");
        double sum = 0;
        double tot = 0;
        for (int i = 0; i < n; i++) {
            sum = price[i] * quantity[i];
            System.out.printf("Product %d: %.2f\n",(i+1),sum);
            tot = tot+sum;
        }
        System.out.println("----------------");
        System.out.println("Total: "+tot);
        
    }
}
