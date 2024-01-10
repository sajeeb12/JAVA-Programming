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
public class PostiveOrNegative {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scn.nextInt();
        
        if(number>0){
            System.out.printf("%d is Positive",number); 
        }
        else if(number<0){
            System.out.printf("%d is Negative",number);
        }
        else{
            System.out.printf("%d is Zero",number);
        }
    }
}
