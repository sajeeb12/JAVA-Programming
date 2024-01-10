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
public class CountDuplicateValues {
    public static void main(String[] args){
        int[] array = {1,2,2,3,1,4,5,4,6,7};
        int c = 0;
        for (int i = 0; i < array.length; i++) {
//            int c = 0;
            for (int j = i+1; j < 10; j++) {
                if(array[i] == array[j]){
                    c++;
                    break;
                }
            }
        }
        System.out.println("Total Duplicate number is: "+c);
    }
}
