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
public class CapitalOrSmall {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Letter: ");
        
        char c = scn.next().charAt(0);
        if(c >= 'a' && c <='z'){
            System.out.println("Small Letter");
        }
        else if(c >= 'A' && c <='Z'){
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
