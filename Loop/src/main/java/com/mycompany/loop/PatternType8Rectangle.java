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
public class PatternType8Rectangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = scn.nextInt();
        
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
