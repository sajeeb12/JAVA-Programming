/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifelse;
import java.util.Scanner;

/**
 *
 * @author sajeeb
 */
public class ElectricityBills {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter unit:");
        int unit = scn.nextInt();
        double bill = 0.0;
        if(unit<=50){
            bill = 0.5 * unit;
        }
        else if(unit <=150){
             bill = 25 + ((unit-50) * 0.75);
        }
        else if(unit <=250){
            bill = 100 + ((unit-150) * 1.20);
        }
        else{
            bill = 220 + ((unit - 250) * 1.50);
        }
        
        System.out.println("Total Bill : " + bill);
        System.out.println("Total Bill with Surcharge : " + (bill + (bill * 0.20)));
        
        
        
    }
    
    
}
