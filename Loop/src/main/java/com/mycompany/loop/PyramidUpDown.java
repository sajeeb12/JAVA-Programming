/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class PyramidUpDown {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = scn.nextInt();
        
        for (int row = 1; row <=n; row++) {
            for (int space = 1; space <=n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=2*row-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int row = n-1; row >=1; row--) {
            for (int space = 1; space <=n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=2*row-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//                     Output                  //
/*

Enter Value: 4
   *
  ***
 *****
*******
 *****
  ***
   *

*/