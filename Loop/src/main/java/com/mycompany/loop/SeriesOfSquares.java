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
public class SeriesOfSquares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Starting Value:");
        int m = scn.nextInt();
        
        System.out.print("Enter Ending Value:");
        int n = scn.nextInt();
        
        int sum = 0;
        
        for (int i = m; i <=n; i++) {
            int sqr = i*i;
            System.out.print(sqr+" ");
            sum = sum + sqr;
        }
        System.out.println();
        System.out.println("Sum is: "+sum);
        
    }
}
