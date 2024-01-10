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
public class PatternBinary {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter Value: ");
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col%2+" ");//Binary Value
  //              System.out.print(row%2+" ");Same Binary Value in each Column
//                  System.out.print(row+" ");Same Value in each Column
            }
            System.out.println();
        }
    }
}
