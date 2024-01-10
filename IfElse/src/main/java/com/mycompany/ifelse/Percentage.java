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
public class Percentage {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int phy,che,bio,math,ict;
        System.out.print("Enter the marks of Physics:");
        phy = scn.nextInt();
        
        System.out.print("Enter the marks of Chemistry:");
        che = scn.nextInt();
        
        System.out.print("Enter the marks of Biology:");
        bio = scn.nextInt();
        
        System.out.print("Enter the marks of Mathematics:");
        math = scn.nextInt();
        
        System.out.print("Enter the marks of ICT:");
        ict = scn.nextInt();
        double sum = (phy + che + bio + math + ict);
        
        double per = sum / 5.0;
        
        if(per >= 90){
            System.out.println("You Achieved Grade A");
        }
        if(per >= 80){
            System.out.println("You Achieved Grade B");
        }
        if(per >= 70){
            System.out.println("You Achieved Grade C");
        }
        if(per >= 60){
            System.out.println("You Achieved Grade D");
        }
        else{
            System.out.println("You Failed");
        }
        
        System.out.println("Total number: " + sum);
        System.out.println("Percentage: " + per);
        
    }
}
