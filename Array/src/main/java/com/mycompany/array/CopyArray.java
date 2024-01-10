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
public class CopyArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scn.nextInt();
        
        int[] array = new int[size];
        int[] copyArray = new int[size];
        System.out.println("Enter Array Value: ");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println("Initial Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Copy Array: ");
        for (int i = 0; i < size; i++) {
            copyArray[i] = array[i];
            System.out.print(copyArray[i]+" ");
        }
        
    }
}
