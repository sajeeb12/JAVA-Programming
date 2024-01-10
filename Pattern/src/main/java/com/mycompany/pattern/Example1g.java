/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pattern;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Example1g {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
               if(row ==1 || row==n || col ==(n-row)+1) {
                   System.out.print("#");
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
