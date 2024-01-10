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
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 15;
        String binary = Integer.toBinaryString(x);
        System.out.println("Binary is: "+binary);
        String octal = Integer.toOctalString(x);
        System.out.println("Octal is: "+octal);
        
        String hex = Integer.toHexString(x);
        System.out.println("Hex is: "+hex);
        
        int dec = Integer.parseInt(hex,16);
        System.out.println("Decimal: "+dec);
        
        
        
        
        
    }
}
