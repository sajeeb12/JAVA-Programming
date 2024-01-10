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
public class ThirdHighestElementinArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = {11,8,13,15,6};
        int max1 = a[0];
        int max2 = -1;
        int max3 = -1;
        
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i]>max2){
                max3 = max2;
                max2 = a[i];
            }
            else if(a[i]>max3){
                max3 = a[i];
            }
            
            
        }
        System.out.println("Max1: "+max1);
            System.out.println("Max2: "+max2);
            System.out.println("Max3: "+max3);
    }
}
