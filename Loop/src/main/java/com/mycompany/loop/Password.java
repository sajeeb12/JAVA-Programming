/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Password {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        System.out.println("Please Enter Information Correctly: ");
        while(true){
//            System.out.println("Please Enter Information Correctly");
            System.out.print("Enter Name:");
            String name = scn.nextLine();
            
        
            System.out.print("Enter Pass:");
            String pass = scn.nextLine();
            
            
            
            if(name.equals("sajeeb") && pass.equals("1234")){
                System.out.println("Thank You");
                break;
            }
            System.out.println("Incorrect Info");
            
        }
        
    }
}
