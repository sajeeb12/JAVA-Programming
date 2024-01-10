/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.switchstatement;
import java.util.Scanner;
/**
 *
 * @author sajeeb
 */
public class NumberOfDaysInMonth {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Month Name: ");
        
        String month = scn.nextLine();
        switch(month){
            case "February":
                System.out.println(month+" has 28 Days");
                break;
           case "April":
                System.out.println(month+" has 30 Days");
                break;
            case "June":
                System.out.println(month+" has 30 Days");
                break;
            case "September":
                System.out.println(month+" has 30 Days");
                break;
            case "November":
                System.out.println(month+" has 30 Days");
                break;
            default:
                System.out.println(month+" has 31 Days");
                break;
        }
    }
}
