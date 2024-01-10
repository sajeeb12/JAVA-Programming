/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class WeekDays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(n==i){
                System.out.println("The day is: "+array[i-1]);
            }
        }
        
    }
}
