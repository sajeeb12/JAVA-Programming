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
public class RemoveAnyIndexValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[100];
        int size = 5;
        System.out.println("Enter Array Value: ");
        for (int i = 0; i < 5; i++) {
            array[i] = scn.nextInt();
        }
        System.out.println("Enter the position you want to remove: ");
        int pos = scn.nextInt();
        for (int i = pos; i <size ; i++) {
            array[i] = array[i+1];
        }
        array[size] = 0;
        for (int i = 0; i <size-1; i++) {
            System.out.println(array[i]);
        }
    }
}
