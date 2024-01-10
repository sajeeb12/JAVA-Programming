/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sum;
import java.util.Scanner;

/**
 *
 * @author sajeeb
 */
public class Input {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter Your Name:");
        String name;
        name = scn.nextLine();
        System.out.printf("\nMy name is: %s",name);
        
    }
}
