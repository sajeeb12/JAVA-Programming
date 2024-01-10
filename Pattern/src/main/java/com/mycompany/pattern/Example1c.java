/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pattern;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class Example1c {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 0; row <=n; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }
            for (int col = row; col <=n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
