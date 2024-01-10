/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank;
import java.util.Scanner;

/**
 *
 * @author sajeeb
 */
public class Stdin_Stdout {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int i;
        double d;
        String s;
        
//        System.out.println("Enter Value");
        i = scn.nextInt();
//        System.out.println("Enter Value");
        d = scn.nextDouble();
        scn.nextLine();
//        System.out.println("Enter Value");
        s = scn.nextLine();
        
        System.out.println("String: "+s);
        System.out.println("Int "+i);
        System.out.println("Double "+d);
        
    }
}
