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
public class PyramidSpaceBetweenValueReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter value: ");
        int n = scn.nextInt();
        
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <=n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//              OutPut              //
/*
Enter value: 4

* * * * 
 * * * 
  * * 
   * 

*/