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
public class TriangleIsValid {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int value1,value2,value3;
        System.out.print("Enter 1st Value: ");
        value1 = scn.nextInt();
        System.out.print("Enter 2nd Value: ");
        value2 = scn.nextInt();
        System.out.print("Enter 3rd Value: ");
        value3 = scn.nextInt();
        
        if(value1 + value2 + value3 == 180){
            System.out.println("Triangle is Valid");
        }
        else{
            System.out.println("Not a Valid Triangle");
        }
    }
}
