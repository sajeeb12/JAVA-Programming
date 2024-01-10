/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class AddElementInAnyIndex {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[100];
//        int[] newArr = new int[100];
        int pos = 1;
        System.out.println("Enter Array Element: ");
        for (int i = 0; i < 5; i++) {
            array[i] = scn.nextInt();
        }
        
        for (int i = 4; i>=pos; i--) {
            array[i+1] = array[i];   
        }
        array[pos] = 15;
        System.out.println("New Array:");
        for (int i = 0; i <6; i++) {
            System.out.println(array[i]);
        }
    }
}
