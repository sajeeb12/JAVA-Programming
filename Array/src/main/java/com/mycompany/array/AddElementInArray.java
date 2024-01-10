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
public class AddElementInArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int[] array = {10,20,30,40,50};
        int[] newarr = new int[array.length+1];
        for (int i = 0; i <array.length; i++) {
            newarr[i]=array[i];
           
        }
        newarr[array.length] = 60; 
        for (int i = 0; i <newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }
}
