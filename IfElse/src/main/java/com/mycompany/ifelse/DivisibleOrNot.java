/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifelse;
import java.util.*;

/**
 *
 * @author sajeeb
 */
public class DivisibleOrNot {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int num = scn.nextInt();
        
        if(num % 5 == 0 && num % 11 == 0){
            System.out.printf("%d is divisible by both 5 & 11",num);
        }
        else{
           System.out.printf("%d is not divisible by both 5 & 11",num); 
        }

    }
}
