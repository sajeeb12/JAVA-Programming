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
public class FindMaximum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Size of the array: ");
        int size = scn.nextInt();
        
        int[] array = new int[10];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter element no. %d: \n",i+1);
            array[i] = scn.nextInt();
        }
        
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum is: "+max);
    }
}
