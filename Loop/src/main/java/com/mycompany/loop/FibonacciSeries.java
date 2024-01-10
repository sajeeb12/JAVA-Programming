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
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int n = scn.nextInt();
        int first = 0;
        int second = 1;
        int fibo = 0;
        System.out.print(first + " "+second+" ");
        for (int i = 3; i <=n; i++) {
            fibo = first + second;
            System.out.print(fibo+" ");
            first = second;
            second = fibo;
        }
        
    }
}
