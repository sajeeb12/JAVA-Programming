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
public class PrimeNumberBetweenMtoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Starting Point: ");
        int m = scn.nextInt();
        
        System.out.println("Ending Point: ");
        int n = scn.nextInt();
        int c = 0;
        
        int count = 0;
        for (int i = m; i <=n; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i+" is a Prime Number");
                c++;
//                System.out.println("");
            }
//            else{
//                System.out.println(i+" is not a Prime Number");
//            }
            count = 0;
        }
        System.out.println("Total Prime Number: "+c);
    }
 
}
