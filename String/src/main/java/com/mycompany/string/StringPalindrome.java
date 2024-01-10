/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.string;
import java.util.*;
/**
 *
 * @author sajeeb
 */
public class StringPalindrome {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s1 = "madam";
        StringBuffer s = new StringBuffer(s1);
        
        String s2 = s.reverse().toString();
        if(s2.equals(s1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
//        System.out.println(s.reverse());
        
    }
}
