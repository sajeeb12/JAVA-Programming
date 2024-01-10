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
public class ArmstrongNumberMtoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Lower Value: ");
        int m = scn.nextInt();
        
        System.out.print("Enter Ending Value: ");
        int n = scn.nextInt();
        int r,sum;
        r = sum = 0;
        
        for (int i = m; i <=n; i++) {
            int temp = i;
            while(temp != 0){
                r = temp%10;
                sum = (int) (sum + Math.pow(r,3));
                temp = temp/10;
            }
            
            if(sum==i){
                System.out.println(i+" is a Armstrong number");
            }
            
            sum = 0;
        }
    }
}
