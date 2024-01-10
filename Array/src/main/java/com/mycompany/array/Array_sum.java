/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Array_sum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int x = scn.nextInt();
        int[] n = new int[10];
        int sum = 0;
        
        for (int i = 0; i <x; i++) {
            n[i] = scn.nextInt();
        }
        for (int i = 0; i <n.length; i++) {
            sum = sum+n[i];
        }
        System.out.println("Sum is: "+sum);
    }
}
