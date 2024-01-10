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
public class MaximumBetweenThree {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter 1st Number");
        num1 = scn.nextInt();
        
        System.out.println("Enter 2nd Number");
        num2 = scn.nextInt();
        
        System.out.println("Enter 3rd Number");
        num3 = scn.nextInt();
        
        if(num1>num2 && num1>num3){
            System.out.printf("%d is the maximum",num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.printf("%d is the maximum",num2);
        }
        else{
            System.out.printf("%d is the maximum",num3);
        }
        
    }
}
