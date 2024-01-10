/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Loop2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter total series:");
        int q = scn.nextInt();
        
//        System.out.println("Enter value:");
//        int n = scn.nextInt();
//        
//        System.out.println("Enter A:");
//        int a = scn.nextInt();
//        
//        System.out.println("Enter B:");
//        int b = scn.nextInt();
//        
//        System.out.println("For Second Series:");
//        System.out.println("Enter value:");
//        int n1 = scn.nextInt();
//        
//        System.out.println("Enter A:");
//        int a1 = scn.nextInt();
//        
//        System.out.println("Enter B:");
//        int b1 = scn.nextInt();

        
        
        
        
        
        int a,b,n;
        int sum = 0;
//        
        for (int i = 1; i <= q; i++) {
                a = scn.nextInt();
                b = scn.nextInt();
                n = scn.nextInt();
              
              for (int j = 0; j < n; j++) {
                sum = (int) (sum + a + Math.pow(2,j)*b);
                System.out.print(sum+" ");
                sum = sum - a;
            }
            sum = 0;
            
            System.out.println();
            
        }
//        
//        
//        
    }
}
