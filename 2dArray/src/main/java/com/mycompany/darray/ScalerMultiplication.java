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
public class ScalerMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int value = 5;
        int[][] a = {{1,2,3},
                    {4,5,6}};
        int[][] scl = new int[2][3];
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                scl[row][col] = value * a[row][col];
            }
        }
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(scl[row][col]+" ");
            }
            System.out.println();
        }
    }
}
