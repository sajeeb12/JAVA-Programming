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
public class Example8b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum = 0;
        for (int i = 3; i <=n; i++) {
            double r = 0.0;
            if(i%2!=0){
                r = 1.0/i;
                System.out.printf("1/%d\n",i);
            }
            sum = sum+r;
            
        }
        double total = 4 * (1-sum);
        System.out.println("Total is: "+total);
    }
 
}
