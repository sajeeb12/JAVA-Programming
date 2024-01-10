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
public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int[][] a = {{1,2,3},
            {4,5,6}};
        int[][] b = {{1,2,3},
            {4,5,6}};
        int[][] sub = new int[2][3];
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sub[row][col] = a[row][col] - b[row][col];
            }
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(sub[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
