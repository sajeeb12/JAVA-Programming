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
public class TriangleUpDown {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row =1 ; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            for (int i = 1; i <=(2*row)-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n-1; i >=1; i--) {
            for (int space = 1; space <=n-i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
