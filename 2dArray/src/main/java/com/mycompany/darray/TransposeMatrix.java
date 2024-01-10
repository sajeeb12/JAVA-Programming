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
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] a = {{1,2,3},
            {4,5,6},
            {7,8,9}};
        int[][] b = new int[3][3];
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                b[row][col] = a[col][row];
//                System.out.print([col][row]+"\t");
            }
//            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
