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
public class StringMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = "Sajeeb Molla";
        
        String s2 = new String("Sajeeb Molla");
        
        System.out.println("Length of s1: "+s1.length());
        
        if(s1.equals(s2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
        
//        Concat two strings;
        String first_name = "Sajeeb ";
        String last_name = "Molla";
        System.out.println("FullName: "+first_name.concat(last_name));
//        Lowercase to uppercase
        String s = "sajeeb";
        System.out.println("Lower to Upper: "+s.toUpperCase());
//        Upperrcase to lowercase
        String x = "SAJEEB";
        System.out.println("Upper to lower: "+x.toLowerCase());
    }
}
