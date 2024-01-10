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
public class Find2ndHighestValue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = {11,4,16,13,5,6,19,8};
        int max1,max2;
        if(array[0]>array[1]){
            max1 = array[0];
            max2 = array[1];
        }
        else{
            max1 = array[1];
            max2 = array[0];
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max1){
                max2 = max1;
                max1 = array[i];
            }
            else if(array[i]>max2){
                max2 = array[i];
            }
        }
        System.out.println("Maximum: "+max1);
        System.out.println("2nd Max: "+max2);
    }
}
