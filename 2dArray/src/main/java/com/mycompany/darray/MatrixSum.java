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
public class MatrixSum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[][] a = {{1,2,3},
            {4,5,6}};
        int[][] b = {{6,5,4},
            {3,2,1}};
        int[][] sum = new int[2][3];
//        int x = 0;
        
        for (int row = 0; row <2; row++) {
            for (int col = 0; col <3; col++) {
//               x = a[row][col] + b[row][col]; 
//               System.out.print(" "+x);
                sum[row][col] = a[row][col] + b[row][col];
            }
        }
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(sum[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
