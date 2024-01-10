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
public class LikeJavaOrNot {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Do you Like Java:");
        char c = scn.next().charAt(0);
        if(c == 'y' || c=='Y'){
            System.out.println("Yes");
        }
        else if(c == 'n' || c=='N'){
            System.out.println("Not");
        }
        else{
            System.out.println("INVALID");
        }
    }
}
