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
public class MultipleOfOddSeriesValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value:");
        
        int n = scn.nextInt();
        int multiple = 1;
        for (int i = 1; i <= n; i = i+2) {
            System.out.print(i+" ");
            multiple = multiple * i;
        }
        System.out.println();
        System.out.println("Result is: "+multiple);
    }
 
}
