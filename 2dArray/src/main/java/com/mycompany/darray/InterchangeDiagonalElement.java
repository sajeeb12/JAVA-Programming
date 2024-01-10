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
public class InterchangeDiagonalElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] a = {{1,2,3},
            {4,5,6},
            {7,8,9}};
        int temp;
        for (int row = 0; row < 3; row++) {
            
            temp = a[row][row];
            a[row][row] = a[row][3-row-1];
            a[row][3-row-1] = temp;
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(a[row][col]+" ");
            }
            System.out.println();
        }
    }
}
