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
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Starting Number: ");
        int m = scn.nextInt();
        
        System.out.print("Enter Ending Number: ");
        int n = scn.nextInt();
        
        int sum = 0;
        
        for (int i = m; i <= n; i++) {
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.printf("Sum of Odd numbers between %d to %d is : %d",m,n,sum);
    }
}
