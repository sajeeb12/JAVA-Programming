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
public class SeriesOfDoubleNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value: ");
        double n = scn.nextDouble();
        double sum = 0;
        for (double i = 1.5; i <= n; i++) {
            System.out.print(i+" ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum is: "+sum);
    }
}
