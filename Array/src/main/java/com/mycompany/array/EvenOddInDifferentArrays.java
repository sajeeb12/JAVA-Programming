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
public class EvenOddInDifferentArrays {
    public static void main(String[] args){
        int[] array = {10,11,12,23,25,24,27,30};
        int[] odd = new int[10];
        int[] even = new int[10];
        int even1 = 0;
        int odd1 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                even[even1] = array[i];
                even1++;
//                System.out.print("Even Array: "+even[i]);
            }
            else if(array[i]%2!=0){
                odd[odd1] = array[i];
                odd1++;
//                System.out.print("Odd Array: "+odd[i]);
            }
        }
        System.out.print("Even Array: ");
        for (int i = 0; i < even1; i++) {
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.print("Odd Array: ");
        for (int i = 0; i < odd1; i++) {
            System.out.print(odd[i]+" ");
        }
        
    }
}
