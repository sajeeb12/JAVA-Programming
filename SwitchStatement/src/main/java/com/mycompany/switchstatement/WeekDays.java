/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.switchstatement;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class WeekDays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scn.nextInt();
        
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
             case 3:
                System.out.println("Wednesday");
                break; 
            case 4:
               System.out.println("Thursday");
               break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a Valid day Number");
        }
    }
}
