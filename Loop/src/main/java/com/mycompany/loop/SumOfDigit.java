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
public class SumOfDigit {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int num = scn.nextInt();
        int temp = num;
        int r = 0,sum = 0;
        while(temp != 0){
            r = temp%10;
            sum = sum + r;
            temp = temp/10;
        }
        System.out.println("Sum of Digit is : "+sum);
        
    }
}
