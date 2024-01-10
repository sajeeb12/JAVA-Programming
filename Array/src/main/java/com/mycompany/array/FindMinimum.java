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
public class FindMinimum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Size: ");
        
        int size = scn.nextInt();
        int[] array = new int[size];
        System.out.println("Enter Array Value: ");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Minimum is: "+min);
    }
}
