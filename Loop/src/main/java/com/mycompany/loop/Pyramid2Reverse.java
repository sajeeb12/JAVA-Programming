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
public class Pyramid2Reverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int n = scn.nextInt();
        
        for (int row = n; row >=1; row--) {
            for (int space = 0; space <=n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2*row)-1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Enter Value: 
5

 *********
  *******
   *****
    ***
     *

*/