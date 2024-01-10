/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.darray;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int[][] a = {{3,-9,-8},
            {2,4,3}};
        int[][] b = {{7,-3},
            {-2,3},
            {6,2}};
        int sum = 0;
        int[][] c = new int[2][2];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                for (int k = 0; k <3; k++) {
                   sum = sum+a[row][k] * b[k][col];
                   
                   
                }
                c[row][col] = sum;
                   sum = 0;
//                System.out.print(sum+"\t");
            }
//            System.out.print(sum+"\t");
            
        }
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(c[row][col]+" ");
            }
            System.out.println();
        }
        
        
    }
}
