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
public class SumOfN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = scn.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);
    }
}
