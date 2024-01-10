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
public class CallCenterLanguage {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scn.nextInt();
        
        switch(number){
            case 1:
                System.out.println("Selected Language is Bengali");
                break;
            case 2:
                System.out.println("Selected Language is English");
                break;
            case 3:
                System.out.println("Selected Language is Spanish");
                break;
            case 4:
                System.out.println("Selected Language is Arabic");
                break;
            default:
                System.out.println("Invalid number to select a language");
        }
    }
}
