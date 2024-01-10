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
public class Example1d {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 0; row <n; row++) {
            for (int space = 0; space <n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col<=row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
