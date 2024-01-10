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
public class StringToPrimitive {
    public static void main(String[] args) {
        int n = 5;
//        Primitive to String
        String s = Integer.toString(n);
        System.out.println("str: "+s);
        
//        String to Primitive
        String k = "32";
        int z = Integer.parseInt(k);
        System.out.println("Int: "+k);    
    }
}
