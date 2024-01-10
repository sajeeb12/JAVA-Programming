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
public class Example8a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum = 0;
        for (int i = 1; i <=n; i++) {
            double r = 1.0/i;
            sum = sum+r;
            System.out.println(r);
        }
        System.out.println("Sum: "+sum);
    }
}
