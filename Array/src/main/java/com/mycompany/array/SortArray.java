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
public class SortArray {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
        int[] array = {12,4,6,17,5};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
                
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
            
        
    }
}
