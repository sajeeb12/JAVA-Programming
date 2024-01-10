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
public class CountFrequencyOfEachNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = {1,2,1,3,2,3,4,2,5,7,3,5,11};
        int[] freq = new int[array.length];
        int visited = -1;
        
        for (int i = 0; i < array.length; i++) {
            int c = 1;
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    c++;
                    freq[j] = visited;
                }  
            }
            if(freq[i]!=visited){
                    freq[i] = c;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != visited)
                System.out.println(array[i]+" is : "+freq[i]+" times");
        }
    }
}
