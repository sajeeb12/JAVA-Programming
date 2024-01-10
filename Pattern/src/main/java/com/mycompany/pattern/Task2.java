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
public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c = 0;
        int n = scn.nextInt();
        for (int row = 1;  row<=n; row++) {
            for (int col = 1; col <=row; col++) {
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
