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
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int m = scn.nextInt();
        
        System.out.print("Enter Ending Value: ");
        int n = scn.nextInt();
        
        for (int i = m; i<=n; i++) {
            System.out.println("\nTable of "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n",i,j,(i*j));
            }
        }
        
        
    }
}
