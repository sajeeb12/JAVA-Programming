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
public class ChekingPrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int num = scn.nextInt();
        int count = 0;
        
        for(int i = 2; i<num; i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count ==1){
            System.out.println(num+" is not a prime number");
        }
        else{
            System.out.println(num+" is a prime number");
        }
    }
}
