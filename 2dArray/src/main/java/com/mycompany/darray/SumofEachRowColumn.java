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
public class SumofEachRowColumn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int[][] a = {{1,2,3},
            {4,5,6},
            {7,8,9}};
        int sum = 0;
        int sum_col = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                sum = sum + a[row][col];
                sum_col = sum_col + a[col][row];
            }
            
            System.out.printf("Sum of row %d is : %d\n",row,sum);
            
            System.out.printf("Sum of col %d is : %d\n",row,sum_col);
            sum = 0;
            sum_col = 0;
        }
        
        
    }
}
