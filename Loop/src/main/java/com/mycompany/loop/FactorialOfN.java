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
public class FactorialOfN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value:");
        int n = scn.nextInt();
        int fact = 1;
        
        for (int i = n; i >=1; i--) {
            fact = fact *i;
        }
        System.out.println(fact);
    }
}
