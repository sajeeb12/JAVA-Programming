/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hackerrank;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class StringIntro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        String cap1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        String cap2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        int x = s1.compareTo(s2);
//        System.out.println(x);
        System.out.println(s1.length()+s2.length());
        if(x<0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        System.out.println(cap1+" "+cap2);
        
        
    }
}
