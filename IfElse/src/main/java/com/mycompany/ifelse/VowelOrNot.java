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
public class VowelOrNot {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        char c;
        System.out.print("Enter the Character: ");
        c = scn.next().charAt(0);
        System.out.println(c);
        if(c == 'a' || c =='e'|| c=='i' || c=='o' || c=='u'){//Only Small letter
            System.out.println("Vowel");
        }
        else{
            System.out.println("Not Vowel");
        }
    }
    
}
