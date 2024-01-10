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
public class PalindromeBetweenMtoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Starting Value: ");
        int m = scn.nextInt();
        
        System.out.print("Enter Ending Value: ");
        int n = scn.nextInt();
        int r ;
        int sum = 0;
        int c = 0;
        for (int i = m; i <=n; i++) {
            int temp = i;
            while(temp != 0){
                r = temp%10;
                sum = sum * 10 + r;
                temp = temp/10;
            }
//            System.out.println(sum);
            
            if(i==sum){
                System.out.println(i);
                c++;
            }
            sum = 0;
        }
        System.out.println("Total Palindrome is: "+c);
    }
}
