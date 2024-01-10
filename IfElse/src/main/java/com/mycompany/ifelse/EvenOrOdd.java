/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifelse;
import java.util. *;

/**
 *
 * @author sajeeb
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value:");
        int num = scn.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even");
        }
        else{
           System.out.println(num+" is Odd"); 
        }
    }
}
