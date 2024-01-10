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
public class LeapYear {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int year;
        System.out.print("Enter the Year You Want to Check:");
        year = scn.nextInt();
        
        if(year%4==0 && year%100!=0){
           System.out.printf("%d is a Leap Year",year);
        }
        else if(year%400==0){
             System.out.printf("%d is a Leap Year",year);
        }
        else{
             System.out.printf("%d is not Leap Year",year);
        }
    }
}
