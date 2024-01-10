/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class FindNthOfFibonacciValue {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter nth Value: ");
        int n = scn.nextInt();
        int first, second,fibo;
        first = fibo = 0;
        second = 1;
        
        if(n==1){
            System.out.println(first);
        }
        else if(n==2){
            System.out.println(second);
        }
        else{
            for (int i = 3; i <=n; i++) {
                fibo = first + second;
                first = second;
                second = fibo;      
            }
        System.out.println(n+"th Value: "+fibo);
        }
        
        
        
    }
}
