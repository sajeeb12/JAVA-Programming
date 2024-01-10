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
public class ArmStrongNumber {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int num = scn.nextInt();
        
        int r,sum;
        r = sum = 0;
        int temp = num;
        
        while(temp != 0){
            r = temp%10;
            sum = (int) (sum + Math.pow(r, 3));
//            System.out.println(sum);
            temp = temp/10;
        }
        
        if(num == sum){
            System.out.println(num+" is Armstrong number");
        }
        else{
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
