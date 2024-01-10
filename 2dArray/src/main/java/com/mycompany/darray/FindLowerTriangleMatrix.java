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
public class FindLowerTriangleMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] a = {{1,2,3},
            {4,5,6},
            {7,8,9}};
        int sum = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if(row>col){
                    System.out.println(a[row][col]);
                    sum = sum + a[row][col];
                }
            }
        }
        System.out.println("Sum of lower Triangle is: "+sum);
    }
}
