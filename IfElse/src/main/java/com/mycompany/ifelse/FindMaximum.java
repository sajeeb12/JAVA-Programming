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
public class FindMaximum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter 1st Value:");
        number1 = scn.nextInt();
        System.out.print("Enter 2nd Value:");
        number2 = scn.nextInt();
        
        if(number1 > number2){
            System.out.printf("%d is the Maximum number",number1);
        }
        else{
            System.out.printf("%d is the Maximum number",number2);
        }
    }
}
