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
public class ReverseNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter the value:");
        
        int num = scn.nextInt();
        int temp = num;
        int sum,r;
        sum = 0;
        
        while(temp!=0){
            r = temp%10;
            sum = sum * 10 + r;
            temp = temp/10;
        }
        System.out.println("Reverse Number is : "+sum);
        
        //Check Palindrome or not
        if(num == sum){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
